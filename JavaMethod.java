public class JavaMethod {
    static void syaratTiketPesawat(int umur) {
  
      if (umur < 12) {
        System.out.println("Anda Tidak di izinkan mengikuti keberangkatan"); 
        
      } else {
        System.out.println("Anda di izinkan mengikuti keberangkatan"); 
      }
      
    } 
    public static void main(String[] args) { 
        syaratTiketPesawat(11); 
    }  
  }