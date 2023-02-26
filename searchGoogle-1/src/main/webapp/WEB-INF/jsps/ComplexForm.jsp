<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Form</title>
  </head>
  <body>
    <h2 align="center">Registration From</h2>
	<form action="processForm" method="post">
	<div class="container mt-4"> 
	   <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="inputEmail4">First Name</label>
	      <input type="text" class="form-control" id="inputEmail4" placeholder="First Name" name="firstname">
	    </div>
	    <div class="form-group col-md-6">
	      <label for="inputPassword4">Last Name</label>
	      <input type="text" class="form-control" id="inputPassword4" placeholder="Last Name" name="lastname">
	    </div>
	  </div>
	    <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="inputEmail4">Mobile</label>
	      <input type="number" class="form-control" id="inputEmail4" placeholder="Mobile" name="mobile">
	    </div>
	    <div class="form-group col-md-6">
	      <label for="inputPassword4">Age</label>
	      <input type="number" class="form-control" id="inputPassword4" placeholder="Age" name="age">
	    </div>
	  </div>
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="inputEmail4">Email</label>
	      <input type="email" class="form-control" id="inputEmail4" placeholder="Email" name="email">
	    </div>
	    <div class="form-group col-md-6">
	      <label for="inputPassword4">Password</label>
	      <input type="password" class="form-control" id="inputPassword4" placeholder="Password" name="password">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputAddress">Address</label>
	    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="address.address1">
	  </div>
	  <div class="form-group">
	    <label for="inputAddress2">Address 2</label>
	    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor" name="address.address2">
	  </div>
	  <div class="form-row">
	    <div class="form-group col-md-6">
	      <label for="inputCity">City</label>
	      <input type="text" class="form-control" id="inputCity" name="address.city">
	    </div>
	    <div class="form-group col-md-4">
	      <label for="inputState">State</label>
	      <select id="inputState" class="form-control" name="address.state">
	        <option selected>Choose...</option>
	        <option>Jharkhand</option>
	        <option>Odisha</option>
	        <option>UttarPardesh</option>
	        <option>Bihar</option>
	        <option>Karnataka</option>
	        <option>Andhera Pardesh</option>
	      </select>
	    </div>
	    <div class="form-group col-md-2">
	      <label for="inputZip">Zip</label>
	      <input type="number" class="form-control" id="inputZip" name="address.zip">
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="form-check">
	      <input class="form-check-input" type="checkbox" id="gridCheck">
	      <label class="form-check-label" for="gridCheck">
	        Check me out
	      </label>
	    </div>
	  </div>
	  <button type="submit" class="btn btn-primary">Sign in</button>
	  </div>
</form>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>