DROP TABLE IF EXISTS EXAM;

CREATE TABLE EXAM
(
    id        LONG PRIMARY KEY,
    teacherId LONG,
    subjectId Long,
    studentId LONG,

    date      VARCHAR(50),
    grade     VARCHAR(50)
);
