SELECT  students.id, students.firstname, students.lastname, teachers.lastname AS teacher
FROM students
INNER JOIN teachers
ON students.teacherid = teachers.id
ORDER BY students.id;