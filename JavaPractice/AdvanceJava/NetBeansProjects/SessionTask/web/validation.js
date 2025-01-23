
function uname()
{
    x=document.getElementById("t1").value;
    if(x.length<3)
    {
        document.getElementById("s1").innerHTML="invalid name";
        return false;
    }else
    {
       return true;
    }

}

function upass()
{
    x=document.getElementById("t2").value;
    if(x.length<3)
    {
        document.getElementById("s2").innerHTML="invalid password";
        return false;
    }else
    {
       return true;
    }

}


function ucon()
{
    x=document.getElementById("t3").value;
    if(x.length<10)
    {
        document.getElementById("s3").innerHTML="invalid number";
        return false;
    }else
    {
       return true;
    }

}


function validation()
{
    document.getElementById("s1").innerHTML="";
    document.getElementById("s2").innerHTML="";
     document.getElementById("s3").innerHTML="";
    if(uname() && upass()&& ucon())
    {
     form1.submit();   
    }
}