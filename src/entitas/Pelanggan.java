package entitas;

import java.util.ArrayList;

public class Pelanggan {
    private Integer Kode_Reg;
    private Register register;
    private String Password;

    public Integer getKode_Reg() {
        return Kode_Reg;
    }

    public void setKode_Reg(Integer Kode_Reg) {
        this.Kode_Reg = Kode_Reg;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    

}
