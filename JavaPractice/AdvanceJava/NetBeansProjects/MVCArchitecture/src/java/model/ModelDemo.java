
package model;

public class ModelDemo {
    String uname;
    String upass;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUname() {
        return uname;
    }

        
    public String getUpass() {
        return upass;
    }
    public boolean isValid()
    {
    if(uname.equals("abc") && upass.equals("123"))
    {
      return true;
    }
    else
    {
    return false;
    }
        }
}
