function showCourses(){
   fetch("http://localhost:8080/courses") //API endpoint
   .then((Response)=>Response.json())
   .then((courses)=>{
    const datatable=document.getElementById("coursetable")

    courses.forEach(course => {
        var row=`<tr>
            <td>${course.course_id}</td>
            <td>${course.course_name}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>
        </tr>`
        datatable.innerHTML+=row;
        
    });
   })

}
function showEnrolledStudents(){
    fetch("http://localhost:8080/courses/entrolled") //API endpoint
   .then((Response)=>Response.json())
   .then((students)=>{
    const datatable=document.getElementById("entrolledtable")

    students.forEach(student => {
        var row=`<tr>
            <td>${student.name}</td>
            <td>${student.emailId}</td>
            <td>${student.courseName}</td>
           
        </tr>`
        datatable.innerHTML+=row;
        
    });
   })

}