CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE teacher (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE student_teacher (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    teacher_id INT
);
