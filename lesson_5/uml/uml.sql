CREATE TABLE school(
    id INT NOT NULL,
    school_number INT NOT NULL,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE pupil(
    id INT NOT NULL,
    school_id INT NOT NULL,
    fio VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(1) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(school_id) REFERENCES school(id)
);

CREATE TABLE teacher(
    id INT NOT NULL,
    fio VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(1) NOT NULL,
    school_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(school_id) REFERENCES school(id)
);

CREATE TABLE discipline(
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY(id),
);

CREATE TABLE lesson(
    id INT NOT NULL,
    pupil_id INT NOT NULL,
    teacher_id INT NOT NULL,
    discipline_id NOT NULL,
    PRIMARY KEY(discipline_id)
    FOREIGN KEY(pupil_id) REFERENCES pupil(id),
    FOREIGN KEY(teacher_id) REFERENCES teacher(id),
    FOREIGN KEY(discipline_id) REFERENCES discipline(id)
);

