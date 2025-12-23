<HTML>
    <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body style="text-align:left;background-color:white" >
<div style="display: flex; align-items: center; justify-content: center; width: 100vw; background-color: #white">
    <div style="width: 45vw; margin: 20px 0 20px 0; box-shadow: 0px 0px 20px 0px ;background-color:#white">
        <h1 style="color:#00000; text-align:center;font-family: Arial"> Update Your File </h1>

        <h3 style="color:#220643; text-align:center;font-family: Flexport" >Make it Unique Keep it Safe</h3>


        <form style="padding:50px" action="<%=request.getContextPath()%>/update" method="post">
        <div class="mb-3"  id="formFields4">
      <label for="exampleFormControlInput1" class="form-label">Search By File Name</label>
    <a href="Search.jsp">SEARCH</a>
                                                    </div>
            <div class="mb-3"  id="formFields87">
                                     <label for="exampleFormControlInput1" class="form-label">Enter file Name</label>
                             <input type="text" class="form-control" id="exampleFormControlInput76" name="fileName"  value="${fileDto.getFileName()}" required placeholder="max 10 characters">
                             </div>
            <div class="mb-3" >
            <label for="exampleFromInput2" class="form-label">Enter file Type</label>
            <select class="form-select" id="inputGroupSelect02" name="fileType" value="${fileDto.getFileType()}"required>
                                              <option selected>Choose...</option>
                                                <option value=".pdf">.pdf</option>
                                                <option value=".xml">.xml</option>
                                                <option value=".img">.img</option>
                                                <option value=".mp4">.mp4</option>
                                                <option value=".mp3">.mp3</option>
                                                <option value=".java">.java</option>
                                                <option value=".html">.html</option>
                                             </select>
                              </div>


                    <div class="mb-3"  id="formFields4">
                                            <label for="exampleFormControlInput1" class="form-label">Enter file Size</label>
                                            <input type="text" class="form-control" id="exampleFormControlInput5"  value="${ fileDto.getFileSize() }" name="fileSize" required placeholder="min kb max gb">
                                        </div>
                     <div class="mb-3"  id="formFields5">
                                            <label for="exampleFormControlInput1" class="form-label">Enter file Uique number</label>
                                            <input type="text" class="form-control" id="exampleFormControlInput6" name="fileNumber" value="${fileDto.getFileNumber()}" required placeholder=" only 4 numbers allowed">
                  </div>
                   <div class="mb-3"  id="formFields5">
                           <input type="submit"  value="Update">
                       </div>
                 </form>
        </div>
        </div>
    </body>
</HTML>