[1mdiff --git a/src/main/java/com/example/controller/StudentController.java b/src/main/java/com/example/controller/StudentController.java[m
[1mindex bc2b738..4602c76 100644[m
[1m--- a/src/main/java/com/example/controller/StudentController.java[m
[1m+++ b/src/main/java/com/example/controller/StudentController.java[m
[36m@@ -17,13 +17,13 @@[m [mpublic class StudentController {[m
 [m
 [m
 [m
[31m-    @RequestMapping(value="/saveStudent",method = RequestMethod.POST)[m
[32m+[m[32m    @RequestMapping(value="/save",method = RequestMethod.POST)[m
     private void saveStudent(@RequestBody Student student)[m
     {[m
         studentService.saveStudent(student);[m
     }[m
 [m
[31m-    @RequestMapping(value = "/showStudents",method = RequestMethod.GET)[m
[32m+[m[32m    @RequestMapping(value = "/show",method = RequestMethod.GET)[m
     private ResponseDetails showStudents()[m
     {[m
         return studentService.showStudents();[m
[36m@@ -31,7 +31,7 @@[m [mpublic class StudentController {[m
     }[m
 [m
 [m
[31m-    @RequestMapping(value = "/getStudent/{roll}",method = RequestMethod.GET)[m
[32m+[m[32m    @RequestMapping(value = "/get/{roll}",method = RequestMethod.GET)[m
     private ResponseDetails getStudent(@PathVariable String roll)[m
     {[m
         return studentService.getStudent(roll);[m
[36m@@ -39,14 +39,14 @@[m [mpublic class StudentController {[m
     }[m
 [m
 [m
[31m-    @RequestMapping(value = "/saveStudents",method = RequestMethod.POST)[m
[32m+[m[32m    @RequestMapping(value = "/saveMany",method = RequestMethod.POST)[m
     private ResponseDetails saveStudents(@RequestBody ArrayList<Student> students)[m
     {[m
         return studentService.saveStudents(students);[m
 [m
     }[m
 [m
[31m-    @RequestMapping(value = "/countStudents",method = RequestMethod.GET)[m
[32m+[m[32m    @RequestMapping(value = "/count",method = RequestMethod.GET)[m
     private ResponseDetails countStudents()[m
     {[m
         return studentService.countStudent();[m
