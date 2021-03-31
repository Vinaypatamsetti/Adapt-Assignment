function person(fname,lname,age,skills,dateofbirth,address,married,profession)
 {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;
 }
amithab=new person("amithab","bachan",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sranalyst")
abhisheik=new person("abhisheik",21,"HTML","08/06/1997","false","jr analyst")
aradhya=new person("aradhya",12,"06/07/2012")
var aradhya=Object.create(amithab);
print=function()
{
 
 console.log(aradhya.profession);
 console.log(aradhya.address);
}();