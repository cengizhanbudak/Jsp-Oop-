<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Universal</title>
</head>
<body>
<h1><%= "Hoşgeldiniz" %>
</h1>
<br/>
<h3> Hesaplatmak istediğiniz şeklin uzunluğunu  giriniz </h3>
<form action="Hesap" method="post">
    Karenin bir kenarının uzununluğunu giriniz: <input type="text" name="kare">
    <input type="submit" value="Hesapla" name="kare">
</form>

</br>
<form action="Hesap" method="post">
 Dairenin Yarıçap uzununluğunu giriniz: <input type="text" name="daire">
<input type="submit" value="Hesapla">
</form>
</br>
</br>

<form action="Hesap" method="post">
    1. Kenar uzununluğunu giriniz: <input type="text" name="d1">
    </br>
    2. Kenar uzununluğunu giriniz: <input type="text" name="d2">
    <input type="submit" value="Hesapla">
</form>
</br>
<form action="Hesap" method="post">
    Daha önce hesapladığınız Nesneleri listeyin:
    <input type="submit" value="Listele">
</form>

</body>
</html>