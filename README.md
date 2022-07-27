# BTK-SuperHeroProject

## Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

> Bir plain text kullandığımızda kullanıcı tıkladığında plain text'in içindeki yazılar kaybolmaz ve kullanıcı bunu silmek sorunda kalır. Bu yüzden plain text'in içindekileri silip hint kullanmalıyız.

> Hint; kullanıcı input bölümüne ne yazacağını bilsin diye kullanılır. 

### XML Dosyasında Comment Atmak:

> İki blok arasında comment atabiliyoruz fakat bir bloğun içinde comment atamıyoruz. Örneğin Button kod bloğunun içinde comment yazarsak aşağıdaki kodalrı görmüyor.

> Kullanabileceğimiz comment şekli:

![image](https://user-images.githubusercontent.com/109730490/181232961-d86b9b1c-6aa7-4e21-8a9e-1f163bec62c5.png)

## MainActivity ve XML arasındaki Senkronizasyonu Sağlamak

> Aşağıdaki eklemeleri yapmalıyız:

![image](https://user-images.githubusercontent.com/109730490/181236517-5383157d-3419-4942-acb1-301970b9be64.png)

![image](https://user-images.githubusercontent.com/109730490/181236694-043439ac-0dbf-419e-8ca6-73311792b1b3.png)

> Böylece artık xml'de oluşturduğumuz view'lara id'lerini atayarak tanımlamamıza gerek olmadan ulaşabiliriz:

![image](https://user-images.githubusercontent.com/109730490/181236867-053d1557-919e-4dae-b49e-8b29ff3afb76.png)

## Primary Constructor Nedir?

> Primary yani birincil constructor direk sınıf adı tanımlanırken sınıf adının yanında tanımlanır ve sadece sınıf içindeki değişkenlere başlangıc değerlerini vermek için kullanılır. Primary constructor içinde kod yazamayız.

## toIntOrNull metodu:

> Değeri çevirebiliyorsa integer'a çevirir çeviremezse null yapar.

> Bir değişkeni sadece bulunduğumuz sınıfta kullanacaksak private tanımlamak faydalı olabilir çünkü aynı isimde bir değişkeni başka bir sınıftada kullanabiliriz. Karışıklığı önlemek için private kullanmak faydalı olur.

## Projeye ait ekran görüntüleri:

> NOT: input bölümleri Plain Text ile yapıldı ama XML dosyasında "EditText" olarak görünüyor. Output ise ekranda Text View'a basıldı.

![image](https://user-images.githubusercontent.com/109730490/181253594-bc75d9d6-bf85-4c34-a61d-10dc4e24885f.png)

![image](https://user-images.githubusercontent.com/109730490/181253752-b6f2d7c7-14ae-4fb3-81e9-a65ac08384d2.png)

## Kaynaklar

- [mobilhanem.com](https://www.mobilhanem.com/)

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)
