package sample;
class Friend{
    private final String name;

    public Friend(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public synchronized void bow(Friend bower){
	// Добавил synchronized для bower для мониторинга
        synchronized (bower) {
            System.out.format("%s : %s подстрелил меня!\n ", this.name, bower.getName());
            System.out.format("%s : стреляю в ответ!\n ", this.name);
            bower.bowBack(this);
        }
    }

    public synchronized void bowBack(Friend bower){
        System.out.format("%s : %s подстрелил меня!\n ", this.name, bower.getName());
    }

    public static void main(String[] Args){
        Friend alphonse = new Friend(" Alphonse ");
        Friend gaston = new Friend(" gaston ");
            new Thread(() -> alphonse.bow(gaston)).start();
            new Thread(() -> gaston.bow(alphonse)).start();
    }
}