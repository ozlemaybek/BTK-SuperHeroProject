package com.ozlem.superheroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
// MainActivity ve XML arasındaki senkronizasyonu sağlamak için:
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Bir değişkene her yerden ulaşmak istiyorsam burada tanımlamalıyım (global)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCreateSuperHero(view : View){

        // toString metodu sonucu String'e çevirmek için kullanılır:
        // Girilen inputları string'e çevirip değişkenlere atayalım:
        val name = plainTextNameID.text.toString()
        // Primary constructor age parametresini integer olarak isteyeceği için çevirmeliyiz.
        // Fakat kullanıcı String girerse uygulama çöker bu yüzden toInt() değil toIntOrNull() metodu kullanalım:
        // Bu işlemi yaptığım takdirde age artık bir Int değil IntNullable
        // Bu yüzden aşağıda age parametresi null değer olabileceğinden hata verir.
        // Bunu bir null safety mekanizması ile düzeltebiliriz.
        val age = plainTextAgeID.text.toString().toIntOrNull()
        val job = plainTextJobID.text.toString()

        //null safety:
        if(age == null){
            textViewID.text = "Please enter the correct age..."
        }else{
            // Şimdi oluşturduğumuz SuperHero sınıfını kullanarak işlemler yapalım:
            val superHero = SuperHero(name,age!!,job)
            // Yukarıdaki satırda !! koymayabilirim.
            // Çünkü kotlin bir güvenlik mekanizmasında olduğunu ve artık age değerinin null olmayacağını anlıyor.

            // Girilen inputları textView'da bastırdık:
            textViewID.text = "name: ${superHero.name} , age: ${superHero.age} , job: ${superHero.job}"
        }

    }
}