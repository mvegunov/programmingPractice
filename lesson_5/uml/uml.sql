CREATE TABLE school(
    id INT NOT NULL,
    school_number INT NOT NULL,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

COMMENT ON COLUMN school.id IS 'Идентификатор школы';
COMMENT ON COLUMN school.school_number IS 'Номер школы';
COMMENT ON COLUMN school.address IS 'Адрес школы';

CREATE TABLE pupil(
    id INT NOT NULL,
    school_id INT NOT NULL,
    fio VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(1) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(school_id) REFERENCES school(id)
);

COMMENT ON COLUMN pupil.id IS 'Идентификатор ученика';
COMMENT ON COLUMN pupil.school_id IS 'Идентификатор школы';
COMMENT ON COLUMN pupil.fio IS 'ФИО ученика';
COMMENT ON COLUMN pupil.age IS 'Возраст ученика';
COMMENT ON COLUMN pupil.gender IS 'Пол ученика';

CREATE TABLE teacher(
    id INT NOT NULL,
    fio VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(1) NOT NULL,
    school_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(school_id) REFERENCES school(id)
);

COMMENT ON COLUMN teacher.id IS 'Идентификатор учителя';
COMMENT ON COLUMN teacher.fio IS 'ФИО учителя';
COMMENT ON COLUMN teacher.age IS 'Возраст учителя';
COMMENT ON COLUMN teacher.gender IS 'Пол учителя';
COMMENT ON COLUMN teacher.school_id IS 'Идентификатор школы';

CREATE TABLE discipline(
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY(id),
);

COMMENT ON COLUMN discipline.id IS 'Идентификатор предмета';
COMMENT ON COLUMN discipline.name IS 'Название предмета';

CREATE TABLE study(
    pupil_id INT NOT NULL,
    discipline_id INT NOT NULL,
    FOREIGN KEY(pupil_id) REFERENCES pupil(id),
    FOREIGN KEY(discipline_id) REFERENCES discipline(id)
);

COMMENT ON COLUMN study.pupil_id IS 'Идентификатор ученика';
COMMENT ON COLUMN study.discipline_id IS 'Идентификатор предмета';

CREATE TABLE teaching(
    teacher_id INT NOT NULL,
    discipline_id INT NOT NULL,
    FOREIGN KEY(teacher_id) REFERENCES teacher(id),
    FOREIGN KEY(discipline_id) REFERENCES discipline(id)
);

COMMENT ON COLUMN teaching.teacher_id IS 'Идентификатор учителя';
COMMENT ON COLUMN teaching.discipline_id IS 'Идентификатор предмета';
