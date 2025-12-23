
<html>
<form action="search">
<input type="search" name="fileName" placeholder="Enter file name">
<input type="submit">
</form>
File Name : ${file.getFileName()}<br>
File Type: ${file.getFileType()}<br>
File Size: ${file.getFileSize()}<br>
File Number: ${file.getFileNumber()}<br>


<h4><a href="getFile/${file.getFileName()}"> Edit</a> </h4>
</html>