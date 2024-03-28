public class Mahasiswa<A,B> {
    A name;
    A alamat;
    B phone;

    public Mahasiswa (A name, A alamat, B phone) {
        this.name = name;
        this.alamat = alamat;
        this.phone = phone;
    }

    public void print(){
        System.out.println("nama: " + name);
        System.out.println("alamat: " + alamat);
        System.out.println("phone: "  + phone);

    }

    
}