package com.uniyaz.Odev;



import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "hServlet", value = "/Hesap")
public class HesapServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Odev\\belge.txt", true);
        FileInputStream fis = new FileInputStream("C:\\Odev\\belge.txt");
        PrintWriter pw = res.getWriter();

        String user=req.getParameter("kare");
        String user1=req.getParameter("daire");
        String user2=req.getParameter("d1");
        String user3=req.getParameter("d2");

        Kare kare=new Kare();
        Daire daire=new Daire();

        res.getWriter().println();
        pw.println("<html>");
        pw.println("<body>");

        if (user!=null){
            double y=Double.parseDouble(user);
            pw.println("<h3> Seklin alani :" );
            pw.println(kare.alanHesapla(y));
            pw.println("</h3></br>");
            pw.println("<h3>Kareninin çevresi :" );
            pw.println(kare.cevreHesapla(y));
            try {
                String s = "--Kare--";
                String s1 = "Alan:";
                String s2 = "/Çevre:";
                String s3 = "---->";

                String alan1 = String.valueOf(kare.alanHesapla(y));
                String cevre1 = String.valueOf(kare.cevreHesapla(y));
                byte[] s1_array = alan1.getBytes();
                byte[] s2_array =cevre1.getBytes();


                byte[] s1_array1 = s1.getBytes();
                byte[] s1_array2 = s2.getBytes();
                byte[] s_array = s.getBytes();
                byte[] s1_array3 = s3.getBytes();

                fos.write(s_array);
                fos.write(s1_array1);
                fos.write(s1_array);
                fos.write(s1_array2);
                fos.write(s2_array);
                fos.write(s1_array3);

            } catch (Exception ex) {
                System.out.println("File  exception oluştu....");
            }

        }else if (user1!=null){
            double z=Double.parseDouble(user1);
            pw.println("<h3> Seklin alani :" );
            pw.println(daire.alanHesapla(z));
            pw.println("</h3></br>");
            pw.println("<h3>Seklin çevresi :" );
            pw.println(daire.cevreHesapla(z));

            try {
                String s = "--Daire--";
                String s1 = "Alan:";
                String s2 = "/Çevre:";
                String s3 = "---->";

                String alan1 = String.valueOf(daire.alanHesapla(z));
                String cevre1 = String.valueOf(daire.cevreHesapla(z));
                byte[] s1_array = alan1.getBytes();
                byte[] s2_array =cevre1.getBytes();

                byte[] s1_array1 = s1.getBytes();
                byte[] s1_array2 = s2.getBytes();
                byte[] s_array = s.getBytes();
                byte[] s1_array3 = s3.getBytes();

                fos.write(s_array);
                fos.write(s1_array1);
                fos.write(s1_array);
                fos.write(s1_array2);
                fos.write(s2_array);
                fos.write(s1_array3);
            } catch (Exception ex) {
                System.out.println("File  exception oluştu....");
            }
        }else if (user2!=null){
            double i=Double.parseDouble(user2);
            double j=Double.parseDouble(user3);
            Dikdörtgen dikdörtgen=new Dikdörtgen(i,j);
            pw.println("<h3> Seklin alani :" );
            pw.println(dikdörtgen.alanHesapla());
            pw.println("</h3></br>");
            pw.println("<h3>Seklin çevresi :" );
            pw.println(dikdörtgen.cevreHesapla());

            try {
                String s = "--Dikdörtgen--";
                String s1 = "Alan:";
                String s2 = "/Çevre:";
                String s3 = "---->";

                String alan1 = String.valueOf(dikdörtgen.alanHesapla());
                String cevre1 = String.valueOf(dikdörtgen.cevreHesapla());
                byte[] s1_array = alan1.getBytes();
                byte[] s2_array =cevre1.getBytes();


                byte[] s1_array1 = s1.getBytes();
                byte[] s1_array2 = s2.getBytes();
                byte[] s_array = s.getBytes();
                byte[] s1_array3 = s3.getBytes();

                fos.write(s_array);
                fos.write(s1_array1);
                fos.write(s1_array);
                fos.write(s1_array2);
                fos.write(s2_array);
                fos.write(s1_array3);

            } catch (Exception ex) {
                System.out.println("File  exception oluştu....");
            }

        }else{
            try {
                int deger;
                String s = "";
                int say = 0;
                while ((deger = fis.read()) != -1) {
                    s += (byte) deger;
                    say++;
                    pw.write(deger);
                }
            } catch (FileNotFoundException ex) {

                pw.write("Dosya bulunamadı.");
            }
        }
        pw.println("</h3></br>");
        pw.println("</h3></body>");
        pw.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        service(req,resp);



    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        service(req,resp);
    }



}
