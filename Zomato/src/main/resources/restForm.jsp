<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>

<body style="text-align:left;background-color:white" >
 <div style="display: flex; align-items: center; justify-content: center; width: 100vw; background-color: #white">
     <div style="width: 45vw; margin: 20px 0 20px 0; box-shadow: 0px 0px 20px 0px ;background-color:#white">
         <h1 style="color:#00000; text-align:center;font-family: Arial"> Add Your Restaurant </h1>

         <h3 style="color:#220643; text-align:center;font-family: Flexport" >Where every bite feels like home</h3>


         <form style="padding:50px" action="hotel" method="post">
             <div class="mb-3"  id="formFields87">
                                      <label for="exampleFormControlInput1" class="form-label">Enter Restaurant Name</label>
                              <input type="text" class="form-control" id="exampleFormControlInput76" name="restName" required placeholder="max 20 characters">
                              </div>
               <div class="mb-3"  id="formFields7">
                          <label for="exampleFormControlInput1" class="form-label">Enter Restaurant Location</label>
                            <input type="text" class="form-control" id="exampleFormControlInput7" name="address" required placeholder="max 30 characters">
                 </div>


               <div class="mb-3"  id="formFields3">
                          <label for="exampleFormControlInput1" class="form-label">Enter Restaurant City</label>
                            <input type="text" class="form-control" id="exampleFormControlInput6" name="city" required placeholder="max 10 characters">
                 </div>

               <div class="mb-3"  id="formFields8">
                          <label for="exampleFormControlInput1" class="form-label">Enter Restaurant Owner Name</label>
                            <input type="text" class="form-control" id="exampleFormControlInput4" name="ownerName" required placeholder="max 15 characters">
                 </div>


               <div class="mb-3"  id="formFields9">
                          <label for="exampleFormControlInput1" class="form-label">Enter Restaurant Email</label>
                            <input type="email" class="form-control" id="exampleFormControlInput9" name="restEmail" required>
                 </div>
           <div class="mb-3"  id="formFields11">
                           <label for="exampleFormControlInput1" class="form-label">Enter Restaurant Contact Number</label>
                            <input type="number" class="form-control" id="exampleFormControlInput11" name="contact" required placeholder="+91">
                            </div>

           <div class="mb-3" >
                       <label for="exampleFromInput2" class="form-label">Add Your Restaurant Star</label>
                       <select class="form-select" id="inputGroupSelect02" name="stars" required>
                                                         <option selected>Choose...</option>
                                                           <option value="1">1</option>
                                                           <option value="2">2</option>
                                                           <option value="3">3</option>
                                                           <option value="4">4</option>
                                                           <option value="5">5</option>
                                                        </select>
                                         </div>

             <div class="mb-3">
               <label for="exampleFormControlTextarea1" class="form-label">Enter Restaurant Menu,Give Food name with Price</label>
               <textarea class="form-control" name="menu" id="exampleFormControlTextarea1" rows="3"></textarea>
             </div>

             <input type="submit" placeholder"Click To Add">

</form>
</div>
</div>
</body>
</html>