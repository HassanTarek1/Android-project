package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity2 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        listView=findViewById(R.id.listView2);
        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("El Ekhtyar");
        arr2.add("Al-Nehaya");
        arr2.add("Al-Prince");
        arr2.add("Valentino");
        arr2.add("Al-Fetewa");
        arr2.add("Rijalat Al-Bayt");
        arr2.add("Luebat Al-Nesyan");
        arr2.add("B 100 Wish");
        arr2.add("Etneen Fel Sandoq");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr2);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(ListActivity2.this, DetailedActivity.class);
                switch (position){
                    case 0:intent.putExtra("title","El Ekhtyar");
                        intent.putExtra("channel","On, On Drama");
                        intent.putExtra("display","09:00 PM");
                        intent.putExtra("reDisplay","04:00 AM, 09:00 AM, 3:30 PM");
                        intent.putExtra("stars","Amir Karara, Ahmed El Awady, Sarah Adel and Dina Foaud");
                        intent.putExtra("description","The series follows the life of Ahmed Saber El-Mansy, " +
                                "the Thunderbolt Forces commander of the battalion 103 who was martyred in the checkpoint of the Burth Square in " +
                                "the Egyptian city of Rafah in 2017 while countering a terrorist attack in Sinai.");
                        intent.putExtra("promo","https://youtu.be/gbNrpetRUrE");
                        break;
                    case 1:intent.putExtra("title","Al-Nehaya");
                        intent.putExtra("channel","On, On Drama");
                        intent.putExtra("display","10:015 PM");
                        intent.putExtra("reDisplay","02:00 AM, 02:00 PM");
                        intent.putExtra("stars","Youssef El Sherif , Amr Abdel-Geleel, Sahar Al Sayegh, Ahmad Wafiq, Mohamed Lotfy and Nahed Elsebai ");
                        intent.putExtra("description","In 2120 Jerusalem, an engineer tries to find a solution to the energy problem in light of the restrictions that the regime imposes on the population. However," +
                                " everything changes when he comes across his robotic doppelganger. ");
                        intent.putExtra("promo","https://youtu.be/1pSB8BPMIJ0");
                        break;
                    case 2:intent.putExtra("title","Al-Prince");
                        intent.putExtra("channel","DMC, DMC Drama");
                        intent.putExtra("display","01:15 AM");
                        intent.putExtra("reDisplay","10:00 AM, 07:45 PM");
                        intent.putExtra("stars","Mohamed Ramadan ,  Ahmed Zaher,  Nour,  Rojina, Edward, Naglaa Badr, ");
                        intent.putExtra("description","A social drama that chronicles the life of Al-Prince family, especially Radwan Al-Prince who, following the death of his parents, " +
                                "finds himself involved with his family members as he looks after them and tries to guide them through life. ");
                        intent.putExtra("promo","https://youtu.be/Ryj7OcduEeI");
                        break;
                    case 3:intent.putExtra("title","Valentino");
                        intent.putExtra("channel","DMC, DMC Drama");
                        intent.putExtra("display","12:15 AM");
                        intent.putExtra("reDisplay","01:00 PM, 06:30 PM");
                        intent.putExtra("stars"," Adel Imam, Dalal Abdelaziz,  Hamdy Al-Merghany,  Mohamed al-Kilani,  Tarek El Ebiary and  Huda El Mufti ");
                        intent.putExtra("description","Nour Abdel Mejid, AKA Valentino, owns a number of international schools, \"Valentino Schools\", run by him and his domineering wife with whom he's not in agreement. Their disagreements, however, " +
                                "get them on several adventures and reveals many surprises along the way.");
                        intent.putExtra("promo","https://youtu.be/pU-RHi1kla0");
                        break;
                    case 4:intent.putExtra("title","Al-Fetewa");
                        intent.putExtra("channel","Alhayat, Alhayat Drama");
                        intent.putExtra("display","12:00 AM");
                        intent.putExtra("reDisplay","04:00 AM, 04:30 PM");
                        intent.putExtra("stars"," Yasser Galal  Ahmed Salah Hosny  Mai Omar  Naglaa Badr  Ahmed Khalil  Ryad El Kholy");
                        intent.putExtra("description","In the world of local neighborhoods, a sect of strong people come together to manage the affairs of these neighborhoods. Known as Al-Fetewa," +
                                " they are ruffians who shoulder the responsibility of the people in their neighborhoods. ");
                        intent.putExtra("promo","https://youtu.be/JKgiZPLJtqQ");
                        break;
                    case 5:intent.putExtra("title","Rijalat Al-Bayt");
                        intent.putExtra("channel","DMC, DMC Drama, ON, ON Drama");
                        intent.putExtra("display","11:30 PM, 02:00 AM, 12:45 AM, 10:45 PM");
                        intent.putExtra("reDisplay","05:30 AM, 05:00 PM");
                        intent.putExtra("stars","  Ahmad Fahmy  Akram Hosny  Bayyumy Fouad  Dina Mohsen  Lotfy Labib  Mohamed Gomaa ");
                        intent.putExtra("description","As Timon and Bumba move in with their grandfather, they discover that they are expected to bear responsibility and close ranks with the rest of the family to stand up to their grandfather's landlord, " +
                                "who is trying to evict their grandfather from the house to build a residential tower in its place. ");
                        intent.putExtra("promo","https://youtu.be/i3L5KdIeaFc");
                        break;
                    case 6:intent.putExtra("title","Luebat Al-Nesyan");
                        intent.putExtra("channel","MBC MASR, MBC MASR 2");
                        intent.putExtra("display","10:00 PM");
                        intent.putExtra("reDisplay","04:30 AM, 09:30 AM");
                        intent.putExtra("stars","Dina El Sherbiny  Ahmed Dawood  Ahmed Safwat  Injy Al Moqaddem  ِAly Kassem  Mahmoud Qabeil");
                        intent.putExtra("description","Rukia wakes up after a 4-month coma, only to discover that she does not remember anything that happened in the last six years of her life, " +
                                "and that her betrayal brought about her husband's murder.");
                        intent.putExtra("promo","https://youtu.be/HHGlGav5YJk");
                        break;
                    case 7: intent.putExtra("title"," B 100 Wish");
                        intent.putExtra("channel","Alhayat, Alhayat Drama");
                        intent.putExtra("display","01:15 AM");
                        intent.putExtra("reDisplay","01:45 PM, 07:45 PM");
                        intent.putExtra("stars"," Nelly Karim  Asser Yassine  Moustafa Darwish  Islam Ibrahim  Sherif Desouqy  Ola Roshdy");
                        intent.putExtra("description","Sokkar is a professional swindler who gets outdone by Omar, another swindler. As she enters into a series of conflicts to get her money back from him, " +
                                "she eventually decides to unite with him to carry out bigger defrauding operations.");
                        intent.putExtra("promo","https://youtu.be/8idZctyrwKg");
                        break;
                    case 8:intent.putExtra("title"," Etneen Fel Sandoq");
                        intent.putExtra("channel","MBC MASR, MBC MASR 2");
                        intent.putExtra("display","09:30 PM");
                        intent.putExtra("reDisplay","05:15 AM, 03:00 PM");
                        intent.putExtra("stars"," Hamdy Al-Merghany  Mohamed Osama (Os Os)  Bayyumy Fouad  Entsar  Hagag Abdel Azim  Mahmoud Al Bizzawi ");
                        intent.putExtra("description","The twin brothers Shawqy and Zika wish to change their lives for the better, as Shawqy wants to become an actor and Zika a singer. They pursue their lovers and their dreams, but their job as garbage men stands in the way. All while Mamado, " +
                                "the leader of Zambizy, learns he has twin children in Egypt.");
                        intent.putExtra("promo","https://youtu.be/8PyG4j869iI");
                        break;
                }
            startActivity(intent);
            }
        });
    }
}
