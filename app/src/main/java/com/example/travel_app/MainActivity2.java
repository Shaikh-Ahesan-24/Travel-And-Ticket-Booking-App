package com.example.travel_app;


import android.app.Dialog;
import android.os.Bundle;

import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<First> firsts = new ArrayList<>();
    ImageView imageView;
    RecyclerView recyclerView2;
    LinearLayoutManager layoutManager2;
    ArrayList<Second> seconds = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        imageView = findViewById(R.id.ehsan);
        recyclerView = findViewById(R.id.first);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);
        firsts.add(new First(R.drawable.paris, "Paris", "FRANCE", "Paris  is the capital and largest city of France.\n" +
                "      With an estimated population of 2,048,472 residents in January 2025[3] in an area of more\n" +
                "    than 105 km2 (41 sq mi),[4] Paris is the fourth-most populous city in the European Union,\n" +
                "    the ninth-most populous city in Europe and the 30th most densely populated city in the world in\n" +
                "   2022.[5] Since the 17th century, Paris has been one of the world\\'s major centres of finance,\n" +
                "  diplomacy, commerce, culture, fashion, and gastronomy. Because of its leading role in the arts\n" +
                "  and sciences and its early adaptation of extensive street\n" +
                "  lighting, it became known as the City of Light in the 19th century The City of Paris is" +
                " the centre of the Île-de-France region, or Paris Region, with an official estimated population of" +
                " 12,271,794 inhabitants in January 2023, or about 19% of the population of France.[3] " +
                "The Paris Region had a nominal GDP of €765 billion (US$1.064 trillion when adjusted for PPP)[7] in 2021, " +
                "the highest in the European Union.[8] According to the Economist Intelligence Unit Worldwide Cost of Living Survey, in 2022, " +
                "Paris was the city with the ninth-highest cost of living in the world"));
        firsts.add(new First(R.drawable.dubai, "Dubai", "UAE", "In the early 20th century, Dubai developed into a significant regional and\n" +
                "        international trade hub, emphasizing tourism and luxury.[15] Dubai has been a center\n" +
                "        for regional and international trade since the early 20th century, and its economy\n" +
                "        relies on revenues from trade, tourism, aviation, real estate, and financial\n" +
                "        services.[16][17][18][19] Oil revenue helped accelerate the development of the city.\n" +
                "        However, oil production contributed less than 1 percent to the emirate\\'s GDP in 2018.[20]\n" +
                "        Due to financial secrecy, low taxes, and valuable real estate, Dubai is an appealing destination\n" +
                "        for money launderers, criminals, corrupt political figures and sanctioned business-people\n" +
                "        to launder or hide moneyDubai is a major global business hub, consistently ranked among the top cities for trade" +
                ", finance, and logistics.[22][23] The Dubai International Financial Centre (DIFC)," +
                " a leading financial hub in the Middle East and Africa, is home to over 2,500 international companies." +
                "[24] The city is also known for its thriving real estate market, with $761 billion in transactions"
               ));
        firsts.add(new First(R.drawable.china, "Guiyang", "CHINA", "Guiyang[a]" +
                " is the capital of Guizhou province in the People's Republic of China. It is centrally" +
                " located within the province, on the eastern part of the Yunnan–Guizhou Plateau, and sits" +
                " on the north bank of the Nanming River, a tributary of the Wu River. The city is situated " +
                "at an elevation of approximately 1,100 meters (3,600 ft) and covers an area of 8,034 square " +
                "kilometers (3,102 sq mi).[4] According to the 2020 census, Guiyang had a total population " +
                "of 5,987,018, with 4,506,134 " +
                "lived in its six urban districts.Guiyang has a humid subtropical climate and is surrounded by mountains and forests. The area has been inhabited since at least the Spring and Autumn period and officially became the provincial capital in 1413, during the Ming dynasty (not the Yuan dynasty, as the Yuan ended in 1368)." +
                " The city is home to a significant Miao and Bouyei ethnic minority population.Guiyang has a diversified economy, historically known for aluminum production, phosphate mining, and optical instrument manufacturing. Following economic reforms, the service sector now contributes the majority of the city's economic output. Since 2015, targeted in big data have helped Guiyang rapidly emerged as a local innovation hub."));
        firsts.add(new First(R.drawable.austraila, "Melbourne", "AUSTRALIA", "is the capital and most populous city of the Australian state he Australian state of Victoria, and the second-most-populous city in Australia, after Sydney.[1] The city's name generally refers to a 9,993 km2 (3,858 sq mi) metropolitan area also known as Greater Melbourne,[11] comprising an urban agglomeration of 31 local government areas.[12] The name is also used to specifically refer to the local government area named City of Melbourne, whose area is centred on the Melbourne central business district and some immediate surrounds.\n" +
                "\n" +
                "The metropolis occupies much of the northern and eastern coastlines of Port Phillip Bay and spreads into the Mornington Peninsula, part of West Gippsland, as well as the hinterlands towards the Yarra Valley, the Dandenong Ranges, and the Macedon Ranges. As of 2023, the population of the metropolitan area was 5.2 million, or 19% of the population of Australia;[1] inhabitants are referred to as \"Melburnians\".The area of Melbourne has been home to Aboriginal Victorians for over 40,000 years and serves as an important meeting place for local Kulin nation clans.Today, Melbourne is culturally diverse  . "));
        firsts.add(new First(R.drawable.brazil, "Rio de janeiro", "BRAZIL", "Rio de Janeiro (Brazilian Portuguese: [ˈʁi.u d(ʒi) ʒɐˈne(j)ɾu] ⓘ[6]), or simply Rio,[7] is the capital of the state of Rio de Janeiro. It is the second-most-populous city in Brazil (after São Paulo) and the sixth-most-populous city in the Americas.\n" +
                "\n" +
                "Founded in 1565 by the Portuguese, the city was initially the seat of the Captaincy of Rio de Janeiro, a domain of the Portuguese Empire. Brazil, and Algarves. Rio remained as the capital of the pluricontinental monarchy until 1822, when the Brazilian War of Independence began. This is one of the few instances in history that the capital of a colonizing country officially shifted to a city in one of its colonies. Rio de Janeiro subsequently served as the capital of the independent monarchy, the Empire of Brazil, until 1889, and then the capital of a republican Brazil until 1960 when the capital was transferred to Brasília.Rio de Janeiro has the second largest municipal GDP in the country,[8] and 30th-largest in the world in 2008 This is estimated at R$343 billion. In the city are the headquarters of Brazilian oil, mining."));
        firsts.add(new First(R.drawable.london, "London", "ENGLAND", "London[c] is the capital and largest city[d] of both England and the United Kingdom, with a population of 8,866,180 in 2022.[2] Its wider metropolitan area is the largest in Western Europe, with a population of 14.9 million.[7] London stands on the River Thames in southeast England, at the head of a 50-mile (80 km) tidal estuary down to the North Sea, and has been a major settlement for nearly 2,000 years.[8] Its ancient core and financial centre, the City of London, was founded by the Romans as \n" +
                "\n" +
                "As one of the world's major global cities,[14][15] London exerts a strong influence on world art, entertainment, fashion, commerce, finance, education, healthcare, media, science, technology, tourism, transport, and communications.[16][17] London is Europe’s most economically powerful city, and is one of the world's major financial centres.[18] It hosts Europe's largest concentration of higher education institutions,[19] including some of the highest-ranked academic institutions in the world: Imperial College London in natural and applied sciences, the London School of Economics in social sciences, and the comprehensive University College London"));
        firsts.add(new First(R.drawable.usa, "Statue of Liberty", "USA", "The Statue of Liberty (Liberty Enlightening the World; French: La Liberté éclairant le monde) is a colossal neoclassical sculpture on Liberty Island in New York Harbor, within New York City. The copper-clad statue, a gift to the United States from the people of France, was designed by French sculptor Frédéric Auguste Bartholdi and its metal framework was built by Gustave Eiffel. The statue was dedicated on October 28, 1886.\n" +
                "\n" +
                "The statue is a figure of a classically draped woman,[8] likely inspired by the Roman goddess of liberty Libertas.[9] In a contrapposto pose,[8][10] she holds a torch above her head with her right hand, and in her left hand carries a tabula ansata inscribed JULY IV MDCCLXXVI (July 4, 1776, in Roman numerals), the date of the U.S. Declaration of Independence. With her left foot she steps on a broken chain and shackle,[8] commemorating the national abolition of slavery following the American Civil WarThe idea for the statue was conceived in 1865, when the French historian and abolitionist Édouard de Laboulaye proposed a monument to commemorate the upcoming centennial of U.S. independence (1876).the perseverance of American slaves."));
        firsts.add(new First(R.drawable.argentine, "Bariloche", "Argentina", "San Carlos de Bariloche (from the Mapuche name Vuriloche, meaning \"people from the other side of the mountain\"), commonly known simply as Bariloche (Spanish pronunciation: [baɾiˈlotʃe]), is the largest city in the Argentine province of Río Negro and the seat of the department of the same name. It is located in the foothills of the Patagonian Andes on the southern shore of Nahuel Huapi Lake, near the border with Chile.[3] With a population of 135,755 according to the 2022 census,[4] Bariloche is a mid-sized city by national standards but holds significant regional importance,[3] being not only the most populous city in its province but also the largest in the Patagonian Andes,[1] and the third largest in the entire Argentine Patagonia following Neuquén and Comodoro Rivadavia. Its urban zone is characterized by its low density and has an area of more than 220 square kilometres (85 sq mi), extending longitudinally from east to west for about 50 kilometres (31 mi)Bariloche's economy is heavily centered on tourism, making it the country's third most visited destination after Buenos Aires and Mar del Plata,[3] as well as the most popular destination in all of Patagonia."));
        firsts.add(new First(R.drawable.poland, "Warsaw", "POLAND", "Warsaw,[a] officially the Capital City of Warsaw,[8][b] is the capital and largest city of Poland. The metropolis stands on the River Vistula in east-central Poland. Its population is officially estimated at 1.86 million residents within a greater metropolitan area of 3.27 million residents, which makes Warsaw the 6th most-populous city in the European Union.[2] The city area measures 517 km2 (200 sq mi) and comprises 18 districts, while the metropolitan area covers 6,100 km2 (2,355 sq mi).[9] Warsaw is classified as an alpha global city,[10] a major cultural, political and economic hub, and the country's seat of government. It is also the capital of the Masovian Voivodeship.\n" +
                "\n" +
                "Warsaw traces its origins to a small fishing town in Masovia. The city rose to prominence in the late 16th century, when Sigismund III decided to move the Polish capital and his royal court from Kraków. Warsaw served as the de facto capital of the Polish–Lithuanian Commonwealth until 1795, and subsequently as the seat of Napoleon's Duchy of Warsaw.The 19th century and its Industrial Revolution brought a demographic boom, which made warsaw"));
        firsts.add(new First(R.drawable.mecca, "Mecca", "SAUDI ARABIA", "Mecca (/ˈmɛkə/; officially Makkah al-Mukarramah,[a] commonly shortened to Makkah[b]) is the capital of Mecca Province in the Hejaz region of western Saudi Arabia; it is the holiest city according to Islam.[4] It is 70 km (43 mi) inland from Jeddah on the Red Sea, in a narrow valley 277 m (909 ft) above sea level. Its metropolitan population in 2022 was 2.4 million, making it the third-most populated city in Saudi Arabia after Riyadh and Jeddah. Around 44.5% of the population are Saudi citizens and around 55.5% are Muslim foreigners from other countries.[5] Pilgrims more than triple the population number every year during the Ḥajj pilgrimage, observed in the twelfth Hijri month of Dhūl-Ḥijjah.[6] With over 10.8 million international visitors in 2023, Mecca was one of the ten most visited cities in the world.[7]\n" +
                "\n" +
                "Mecca is generally considered \"the fountainhead and cradle of Islam\".[8][9] Mecca is revered in Islam as the birthplace of the Islamic prophet Muhammad. The Hira cave atop the Jabal al-Nur (\"Mountain of Light\"), just outside the city, is where Muslims believe the Quran was first revealed to Muhammad."));
        firsts.add(new First(R.drawable.bangkok, "Bangkok", "Thailand", "Bangkok,[a] officially known in Thai as Krung Thep Maha Nakhon[b] and colloquially as Krung Thep,[c] is the capital and most populous city of Thailand. The city occupies 1,568.7 square kilometres (605.7 sq mi) in the Chao Phraya River delta in central Thailand and has an estimated population of 11.3 million people as of 2021, 13% of the country's population. Over 17.4 million people (25%) live within the surrounding Bangkok Metropolitan Region as of the 2021 estimate, making Bangkok a megacity and an extreme primate city, dwarfing Thailand's other urban centres in both size and importance to the national economy.Bangkok traces its roots to a small trading post during the Ayutthaya Kingdom in the 15th century, which eventually grew and became the site of two capital cities, Thonburi in 1767 and Rattanakosin in 1782. Bangkok was at the heart of the modernization of Siam during the late-19th century, as the country faced pressures from the West. The city was at the centre of the country's political struggles throughout the 20th century, as Siam—later renamed Thailand—abolished absolute monarchy, adopted constitutional rule, and underwent numerous coups and several uprisings ."
                ));
        RecycleFirst adapter = new RecycleFirst(this, firsts);
        recyclerView.setAdapter(adapter);
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.popup);
        imageView.setOnClickListener(view -> dialog.show());
        recyclerView2 = findViewById(R.id.second);
        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);
        seconds.add(new Second(R.drawable.laddak,"Leh Ladakh"," Leh is a city in Indian-administered Ladakh in the disputed Kashmir region.[3] It is the largest city and the joint capital of Ladakh.[4] It is the capital of Ladakh since the Medieval Period.[4] Leh, located in the Leh district, was also the historical capital of the Kingdom of Ladakh. The seat of the kingdom, Leh Palace, the former residence of the royal family of Ladakh, was built in the same style and about the same time as the Potala Palace in Tibet.[citation needed] Since they were both constructed in a similar style and at roughly the same time, the Potala Palace in Tibet and Leh Palace, the royal residence, are frequently contrasted. Leh is at an altitude of 3,524 m (11,562 ft), and is connected via National Highway 1 to Srinagar in the southwest and to Manali in the south via the Leh-Manali Highway (part of National Highway 3)Leh was for centuries an important stopover on trade routes along the Indus Valley between Tibet, Kashmir, India and China. The main goods carried were salt, grain, pashm or cashmere wool, charas or cannabis resin from the Tarim Basin, indigo, silk yarn and Banaras brocade.Although there are a few indications that the Chinese knew of a trade route through Ladakh to India as early as the Kushan period "));
        seconds.add(new Second(R.drawable.munnar,"Munnar"," Munnar is a town and hill station located in the Idukki district of the southwestern Indian state of Kerala. Munnar is situated at around 1,600 metres (5,200 ft) above mean sea level,[4] in the Western Ghats mountain range. Munnar is also called the \"Kashmir of South India\" and is a popular honeymoon destination.The region has been inhabited by hunter-gatherer tribals like the Malayarayan and Muthuvan for thousands of years.[7] In the early days, only Tamils and few Malayalis lived there. They were brought as workers in the tea plantations. Tradition states that Colonel Arthur Wellesley, later the Duke of Wellington, was the first British person to pass through Munnar[8] during Tipu Sultan's campaign in Travancore, but this is unsubstantiated. The first survey of the terrain was undertaken by Benjamin Swayne Ward in 1816–1817, who followed Periyar into the Western Ghats and established a camp at the confluence of three rivers, from which the name of Munnar is derivedIt was to be nearly 50 years later that Sir Charles Trevelyan, Governor of Madras, instructed Col. Douglas Hamilton to explore the hill country in the western part of the Madras Presidency, requesting special advice on the feasibility of establishing."));
        seconds.add(new Second(R.drawable.dharamshala,"Dharamshala"," Dharamshala is a town in the Indian state of Himachal Pradesh. It serves as the winter capital of the state and the administrative headquarters of the Kangra district since 1855.[5][6][7] The town also hosts the Tibetan Government-in-exile. Dharamshala was a municipal council until 2015, when it was upgraded to a municipal corporation.\n" +
                "\n" +
                "The town is located in the Kangra Valley, in the shadow of the Dhauladhar range of the Himalayas at an altitude of 1,457 metres (4,780 ft). References to Dharamshala and its surrounding areas are found in ancient Hindu scriptures such as Rig Veda and Mahabharata. The region was under Mughal influence before it was captured by the Sikh Empire in 1785. The East India Company captured the region for the British following the First Anglo-Sikh War of 1846, from when it became part of the British Indian province of the Punjab. Post Indian Independence in 1947, it remained as a small hill station. In 1960, the Central Tibetan Administration was moved to Dharamshala when the 14th Dalai Lama Tenzin Gyatso established the Tibetan administration-in-exile after he had to flee Tibet.\n"));
        seconds.add(new Second(R.drawable.ooty,"Ooty"," OOTY is a town and municipality in the Nilgiris district of the Indian state of Tamil Nadu. It is located 86 km (53 mi) northwest of Coimbatore, and is the headquarters of Nilgiris district. Situated in the Nilgiri hills, it is known by the epithet \"Queen of Hill Stations\", and is a popular tourist destination.\n" +
                "\n" +
                "Originally occupied by the Toda people, the area came under the rule of the East India Company in the 18th century. It later served as the summer capital of Madras Presidency. The economy is based on the hospitality industry serving tourism and agriculture. The town is connected to the plains by the Nilgiri ghat roads and Nilgiri Mountain Railway. The region was earlier known as Ottakal Mandu, with Otta-kal meaning 'single stone' in Tamil, a reference to a sacred stone revered by the local Toda people and Mandu, a Toda word for 'village'.[4] This later became Udagamandalam which was anglicised to Ootacamund by the British, with the first part of the name (Ootaca), a corruption of the local name for the region and the second part (Mand), a shortening of the local Toda word Mandu .The first known written mention of the place is given as Wotokymund in a letter dated March 1821."));
        seconds.add(new Second(R.drawable.manali,"Manali","Manali is a resort town, near Kullu town in Kullu district in the Indian state of Himachal Pradesh.[2] It is situated in the northern end of the Kullu Valley, formed by the Beas River. The town is located in the Kullu district, approximately 270 kilometres (170 mi) north of the state capital of Shimla and 544 kilometres (338 mi) northeast of the national capital of New Delhi. With a population of 8,096 people recorded in the 2011 Indian census Manali is the beginning of an ancient trade route through Lahaul (H.P.) and Ladakh, over the Karakoram Pass and onto Yarkand and Hotan in the Tarim Basin of China. Manali is a popular tourist destination in India and serves as the gateway to the Lahaul and Spiti district as well as the city of Leh in LadakhManali is named after Manu, the progenitor of humanity in Hinduism. The name Manali is regarded as the derivative of Manu-Alaya (transl. 'the abode of Manu').[4] In Hindu cosmology, Manu is believed to have stepped off his ark in Manali to recreate human life after a great flood had deluged the world at the end of an cyclic age. The Kullu Valley in which Manali is situated is often referred to as the \"Valley of the Gods\".An old village in the town has an ancient temple dedicated to the sage Manu "));
        seconds.add(new Second(R.drawable.darjehling,"Darjeeling"," is a city in the northernmost region of the Indian state of West Bengal. Located in the Eastern Himalayas, it has an average elevation of 2,045 metres (6,709 ft).[10] To the west of Darjeeling lies the easternmost province of Nepal, to the east the Kingdom of Bhutan, to the north the Indian state of Sikkim, and farther north the Tibet Autonomous Region region of China. Bangladesh lies to the south and southeast, and most of the state of West Bengal lies to the south and southwest, connected to the Darjeeling region by a narrow tract. Kangchenjunga, the world's third-highest mountain, rises to the north and is prominently visible on clear daysIn the early 19th century, during East India Company rule in India, Darjeeling was identified as a potential summer retreat for British officials, soldiers and their families. The narrow mountain ridge was leased from the Kingdom of Sikkim, and eventually annexed to British India. Experimentation with growing tea on the slopes below Darjeeling was highly successful. Thousands of labourers were recruited chiefly from Nepal to clear the forests, build European-style cottages and work in the tea plantations. The widespread deforestation displaced the indigenous peoples."));
        seconds.add(new Second(R.drawable.nainital,"Nainital"," Nainital is a town and headquarters of Nainital district of Kumaon division, Uttarakhand, India. It is the judicial capital of Uttarakhand, the High Court of the state being located there and is the headquarters of an eponymous district. It also houses the Governor of Uttarakhand,[7] who resides in the Raj Bhavan. Nainital was the summer capital[8] of the United Provinces.\n" +
                "\n" +
                "Nainital is located in the Kumaon foothills of the outer Himalayas at a distance of 276 km (171 mi) from the state capital Dehradun and 314 km (195 mi) from New Delhi, the capital of India. Situated at an altitude of 1,938 metres (6,358 ft) above sea level, the town is set in a valley containing an eye-shaped lake, approximately two miles in circumference, and surrounded by mountains, of which the highest are Naina Peak (2,615 m (8,579 ft)) on the north, Deopatha (2,438 m (7,999 ft)) on the west, and Ayarpatha (2,278 m (7,474 ft)) on the south. From the tops of the higher peaks, \"magnificent views can be obtained of the vast plain to the south, or of the mass of tangled ridges lying north. bound by the great snowy range which forms the central axis of the Himalayas.\"[9] "));
        seconds.add(new Second(R.drawable.srinagar,"Srinagar","is a city in Indian-administered Jammu and Kashmir in the disputed Kashmir region.[1] It is the largest city and summer capital of Jammu and Kashmir, which is an Indian-administered union territory. It lies in the Kashmir Valley along the banks of the Jhelum River, and the shores of Dal Lake and Anchar Lakes, between the Hari Parbat and Shankaracharya hills. The city is known for its natural environment, various gardens, waterfronts and houseboats. It is also known for traditional Kashmiri handicrafts like the Kashmir shawl (made of pashmina and cashmere wool), papier-mâché, wood carving, carpet weaving, and jewel making, as well as for dried fruits.[11][12] It is the second-largest metropolitan area in the Himalayas (after Kathmandu, the capital of NepalFounded in the 6th century during the rule of the Gonanda dynasty according to the Rajatarangini, the city took on the name of an earlier capital thought to have been founded by the Mauryas in its vicinity. The city remained the most important capital of the Kashmir Valley under the Hindu dynasties, and was a major centre of learning. During the 14th–16th centuries the city's old town saw major expansions, particularly under the Shah Mir dynasty, whose kings used various parts of it as their capitals."));
        seconds.add(new Second(R.drawable.tawang,"Tawang","Tawang is a town and administrative headquarter of Tawang district in the Indian state of Arunachal Pradesh.[1][2] It lies on NH-13 section of Trans-Arunachal Highway. The town was once the headquarter of the Tawang Tract, which is now divided into the Tawang district and the West Kameng district. Tawang continues as the headquarters of the former. Tawang is the number one tourist destination of Arunachal Pradesh.\n" +
                "\n" +
                "India occupied Tawang in 1951 and removed Tibetan administration from the area.[3][4] China continues to claim Tawang as its territory.[3] It is situated 448 km north-west of state capital Itanagar at an elevation of approximately 3,048 metres (10,000 ft). It lies to the north of the Tawang Chu river valley, roughly 10 miles (16 km) south of the Line of Actual Control with China. It is the site of a famous Gelugpa Buddhist Monastery Tawang was historically under the control of Tibet. During the 1914 Simla Conference, Tibet and British India signed an agreement delineating their common boundary in the Assam Himalaya region, which came to be known as the McMahon Line.The hill station attracts tourists round the yearThe British did not implement. "));
        seconds.add(new Second(R.drawable.k,"Kodaikanal","s a municipality and hill station in Dindigul district in the state of Tamil Nadu, India. It is situated at an altitude of 2,225 m (7,300 ft) in the Palani hills of the Western Ghats. Kodaikanal was established in 1845 to serve as a refuge from the high temperatures and tropical diseases during the summer in the plains. It is a popular tourist destination and is referred to as the \"Princess of Hill stations\" with much of the local economy is based on the hospitality industry serving tourism. As per the 2011 census, the city had a population of 36,501.The earliest references to Kodaikanal and the Palani hills are found in Tamil Sangam literature.[3] Tamil composition Kuṟuntokai, the second book of the anthology Ettuthokai, mentions the mountainous geographic region (thinai) of KurinjiThe region is associated with Hindu god Murugan and is described as a forest with lakes, waterfalls and trees like teak, bamboo and sandalwood.[4] The name of the region, Kurinji, derives from the name of the famous flower Kurinji found only in the hills and the occupants of the region were tribal people whose prime occupations were hunting, honey harvesting and millet cultivation.[5][6] The hills were populated by the Palaiyar tribal people.["));
        RecycleSecond adapter2 = new RecycleSecond(this,seconds);
        recyclerView2.setAdapter(adapter2);


    }




}

