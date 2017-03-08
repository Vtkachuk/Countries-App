package countries.countryapp;


import android.content.DialogInterface;
import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
        import android.widget.ImageView;
        import android.widget.Button;
        import android.graphics.Color;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout l = (RelativeLayout) findViewById(R.id.label1);
//        l.setOrientation(LinearLayout.VERTICAL);
        final TextView countryNameTextView = (TextView)findViewById(R.id.countryName);
        final TextView countryCapitalTextView = (TextView)findViewById(R.id.countryCapitalName);
        final TextView countryContinentTextView = (TextView)findViewById(R.id.countryContinent);
        final ImageView countryFlagImageView = (ImageView)findViewById(R.id.countryImageView);
        l.setBackgroundColor(Color.parseColor("grey"));

        final Button normalModeButton = (Button)findViewById(R.id.normalButton);
        final Button europeanCountryModeButton = (Button)findViewById(R.id.europeanButton);
        final Button africanCountryModeButton = (Button)findViewById(R.id.africanButton);
        final Button asianCountryModeButton = (Button)findViewById(R.id.asianButton);
        final Button northAmericanCountryModeButton = (Button)findViewById(R.id.northAmericanButton);
        final Button southAmericanCountryModeButton = (Button)findViewById(R.id.souhtAmericanButton);
        final Button oceanianCountryModeButton = (Button)findViewById(R.id.oceanianButton);
        final Button backButton = (Button)findViewById(R.id.backButton);
        backButton.setEnabled(false);
        backButton.setVisibility(View.INVISIBLE);
        final Button gotItButton = (Button)findViewById(R.id.knowItButton);
        gotItButton.setEnabled(false);
        gotItButton.setVisibility(View.INVISIBLE);



        final HashMap<Integer,Country> countryInfo = new HashMap<Integer,Country>();
        final HashMap<Integer,Country> europeCountryInfo = new HashMap<Integer,Country>();
        final HashMap<Integer,Country> asiaCountryInfo = new HashMap<Integer,Country>();
        final HashMap<Integer,Country> africaCountryInfo = new HashMap<Integer,Country>();
        final HashMap<Integer,Country> northAmericaCountryInfo = new HashMap<Integer,Country>();
        final HashMap<Integer,Country> southAmericaCountryInfo = new HashMap<Integer,Country>();
        final HashMap<Integer,Country> oceaniaCountryInfo = new HashMap<Integer,Country>();

        Country ad = new Country("ad", "Andorra", "Andorra la Vella", "Europe");
        Country ae = new Country("ae", "United Arab Emirates", "Abu Dhabi", "Asia");
        Country af = new Country("af", "Afghanistan", "Kabul", "Asia");
        Country ag = new Country("ag", "Antigua and Barbuda", "St.John's", "North America");
        Country al = new Country("al", "Albania", "Tirana", "Europe");
        Country am = new Country("am", "Armenia", "Yerevan", "Europe");
        Country ao = new Country("ao", "Angola", "Luanda", "Africa");
        Country ar = new Country("ar", "Argentina", "Buenos Aires", "South America");
        Country at = new Country("at", "Austria", "Vienna", "Europe");
        Country au = new Country("au", "Australia", "Canberra", "Oceania");
        Country az = new Country("az", "Azerbaijan", "Baku", "Europe");
        Country ba = new Country("ba", "Bosnia and Herzegovina", "Sarajevo", "Europe");
        Country bb = new Country("bb", "Barbados", "Bridgetown", "North America");
        Country bd = new Country("bd", "Bangladesh", "Dhaka", "Asia");
        Country be = new Country("be", "Belgium", "Brussels", "Europe");
        Country bf = new Country("bf", "Burkina Faso", "Ouagadougou", "Africa");
        Country bg = new Country("bg", "Bulgaria", "Sofia", "Europe");
        Country bh = new Country("bh", "Bahrain", "Manama", "Asia");
        Country bi = new Country("bi", "Burundi", "Bujumbura", "Africa");
        Country bj = new Country("bj", "Benin", "Porto-Novo", "Africa");
        Country bn = new Country("bn", "Brunei Darussalam", "Bandar Seri Begawan", "Asia");
        Country bo = new Country("bo", "Bolivia", "La Paz", "South America");
        Country br = new Country("br", "Brazil", "Brasilia", "South America");
        Country bs = new Country("bs", "Bahamas", "Nassau", "North America");
        Country bt = new Country("bt", "Bhutan", "Thimphu", "Asia");
        Country bw = new Country("bw", "Botswana", "Gaborone", "Africa");
        Country by = new Country("by", "Belarus", "Minsk", "Europe");
        Country bz = new Country("bz", "Belize", "Belmopan", "North America");
        Country ca = new Country("ca", "Canada", "Ottawa", "North America");
        Country cd = new Country("cd", "Democratic Republic of the congo", "Kinshasa", "Africa");
        Country cf = new Country("cf", "Central African Republic", "Bangui", "Africa");
        Country cg = new Country("cg", "Republic of Congo", "Brazzaville", "Africa");
        Country ch = new Country("ch", "Switzerland", "Bern", "Europe");
        Country ci = new Country("ci", "Cote d'Ivoire", "Yamoussoukro", "Africa");
        Country cl = new Country("cl", "Chile", "Santiago", "South America");
        Country cm = new Country("cm", "Cameroon", "Yaounde", "Africa");
        Country cn = new Country("cn", "China", "Beijing", "Asia");
        Country cr = new Country("cr", "Costa Rica", "San Jose", "North America");
        Country co = new Country("co", "Colombia", "Bogota", "South America");
        Country cu = new Country("cu", "Cuba", "Havana", "North America");
        Country cv = new Country("cv", "Cape Verde", "Praia", "Africa");
        Country cy = new Country("cy", "Cyprus", "Nicosia", "Europe");
        Country cz = new Country("cz", "Czech Republic", "Prague", "Europe");
        Country de = new Country("de", "Germany", "Berlin", "Europe");
        Country dj = new Country("dj", "Djibouti", "Djibouti", "Africa");
        Country dk = new Country("dk", "Denmark", "Copenhagen", "Europe");
        Country dm = new Country("dm", "Dominica", "Roseau", "North America");
        Country dominican = new Country("dominican", "Dominican Republic", "Santo Domingo", "North America");
        Country dz = new Country("dz", "Algeria", "Algiers", "Africa");
        Country ec = new Country("ec", "Ecuador", "Quito", "South America");
        Country ee = new Country("ee", "Estonia", "Tallinn", "Europe");
        Country eg = new Country("eg", "Egypt", "Cairo", "Africa");
        Country eh = new Country("eh", "Western Sahara", "El-AaiÃºn", "Africa");
        Country er = new Country("er", "Eritrea", "Asmara", "Africa");
        Country es = new Country("es", "Spain", "Madrid", "Europe");
        Country et = new Country("et", "Ethiopia", "Addis Ababa", "Africa");
        Country fi = new Country("fi", "Finland", "Helsinki", "Europe");
        Country fj = new Country("fj", "Fiji", "Suva", "Oceania");
        Country fm = new Country("fm", "Federated States of Micronesia", "Palikir", "Oceania");
        Country fr = new Country("fr", "France", "Paris", "Europe");
        Country ga = new Country("ga", "Gabon", "Libreville", "Africa");
        Country gb = new Country("gb", "United Kingdom", "London", "Europe");
        Country gd = new Country("gd", "Grenada", "Saint George's", "North America");
        Country ge = new Country("ge", "Georgia", "Tbilisi", "Europe");
        Country gh = new Country("gh", "Ghnana", "Accra", "Africa");
        Country gm = new Country("gm", "Tha Gambia", "Banjul", "Africa");
        Country gn = new Country("gn", "Guinea", "Conakry", "Africa");
        Country gq = new Country("gq", "Equatorial guinea", "Malabo", "Africa");
        Country gr = new Country("gr", "Greece", "Athens", "Europe");
        Country gt = new Country("gt", "Guatemala", "Guatemala City", "North America");
        Country gw = new Country("gw", "Guinea-Bissau", "Bissau", "Africa");
        Country gy = new Country("gy", "Guyana", "Georgetown", "South America");
        Country hn = new Country("hn", "Honduras", "Tegucigalpa", "North America");
        Country hr = new Country("hr", "Croatia", "Zagreb", "Europe");
        Country ht = new Country("ht", "Haiti", "Port-au-Prince", "North America");
        Country hu = new Country("hu", "Hungary", "Budapest", "Europe");
        Country id = new Country("id", "Indonesia", "Jakarta", "Asia");
        Country ie = new Country("ie", "Ireland", "Dublin", "Europe");
        Country il = new Country("il", "Israel", "Jerusalem", "Asia");
        Country in = new Country("in", "India", "New Delhi", "Asia");
        Country iq = new Country("iq", "Iraq", "Baghdad", "Asia");
        Country ir = new Country("ir", "Iran", "Tehran", "Asia");
        Country is = new Country("is", "Iceland", "Reykjavik", "Europe");
        Country it = new Country("it", "Italy", "Rome", "Europe");
        Country jm = new Country("jm", "Jamaica", "Kingston", "North America");
        Country jo = new Country("jo", "Jordan", "Amman", "Asia");
        Country jp = new Country("jp", "Japan", "Tokyo", "Asia");
        Country ke = new Country("ke", "Kenya", "Nairobi", "Africa");
        Country kg = new Country("kg", "Kyrgyzstan", "Bishkek", "Asia");
        Country kh = new Country("kh", "Cambodia", "Phnom Penh", "Asia");
        Country ki = new Country("ki", "Kiribati", "Tarawa", "Oceania");
        Country km = new Country("km", "Comoros", "Moroni", "Africa");
        Country kn = new Country("kn", "Saint Kitts and Nevis", "Basseterre", "North America");
        Country kp = new Country("kp", "North Korea", "Pyongyang", "Asia");
        Country kr = new Country("kr", "South Korea", "Seoul", "Asia");
        Country ks = new Country("ks", "Republic of Kosovo", "Pristina", "Europe");
        Country kw = new Country("kw", "Kuwait", "Kuwait City", "Asia");
        Country kz = new Country("kz", "Kazakhstan", "Astana", "Asia");
        Country la = new Country("la", "Laos", "Vientiane", "Asia");
        Country lb = new Country("lb", "Lebanon", "Beirut", "Asia");
        Country lc = new Country("lc", "Saint Lucia", "Castries", "North America");
        Country li = new Country("li", "Liechtenstein", "Vaduz", "Europe");
        Country lk = new Country("lk", "Sri Lanka", "Colombo", "Asia");
        Country lr = new Country("lr", "Liberia", "Monrovia", "Africa");
        Country ls = new Country("ls", "Lesotho", "Maseru", "Africa");
        Country lt = new Country("lt", "Lithuania", "Vilnius", "Europe");
        Country lu = new Country("lu", "Luxembourg", "Luxembourg", "Europe");
        Country lv = new Country("lv", "Latvia", "Riga", "Europe");
        Country ly = new Country("ly", "Libya", "Tripoli", "Africa");
        Country ma = new Country("ma", "Morocco", "Rabat", "Africa");
        Country mc = new Country("mc", "Monaco", "Monaco", "Europe");
        Country md = new Country("md", "Moldova", "Chisinau", "Europe");
        Country me = new Country("me", "Montenegro", "Podgorica", "Europe");
        Country mg = new Country("mg", "Madagascar", "Antananarivo", "Africa");
        Country mh = new Country("mh", "Marshall Islands", "Majuro", "Oceania");
        Country mk = new Country("mk", "Macedonia", "Skopje", "Europe");
        Country ml = new Country("ml", "Mali", "Bamako", "Africa");
        Country mm = new Country("mm", "Myanmar", "Rangoon", "Asia");
        Country mn = new Country("mn", "Mongolia", "Ulaanbaatar", "Asia");
        Country mr = new Country("mr", "Mauritania", "Nouakchott", "Africa");
        Country mt = new Country("mt", "Malta", "Valletta", "Europe");
        Country mu = new Country("mu", "Mauritius", "Port Louis", "Africa");
        Country mv = new Country("mv", "Maldives", "Male", "Asia");
        Country mw = new Country("mw", "Malawi", "lilongwe", "Africa");
        Country mx = new Country("mx", "Mexico", "Mexico City", "North America");
        Country my = new Country("my", "Malaysia", "Kuala Lumpur", "Asia");
        Country mz = new Country("mz", "Mozambique", "Maputo", "Africa");
        Country na = new Country("na", "Namibia", "Windhoek", "Africa");
        Country ne = new Country("ne", "Niger", "Niamey", "Africa");
        Country ng = new Country("ng", "Nigeria", "Abuja", "Africa");
        Country ni = new Country("ni", "Nicaragua", "Managua", "North America");
        Country nl = new Country("nl", "Netherlands", "Amsterdam", "Europe");
        Country no = new Country("no", "Norway", "Oslo", "Europe");
        Country np = new Country("np", "Nepal", "Kathmandu", "Asia");
        Country nr = new Country("nr", "Nauru", "Yaren", "Oceania");
        Country nz = new Country("nz", "New Zealand", "Wellington", "Oceania");
        Country om = new Country("om", "Oman", "Muscat", "Asia");
        Country pa = new Country("pa", "Panama", "Panama City", "North America");
        Country pe = new Country("pe", "Peru", "Lima", "South America");
        Country pg = new Country("pg", "Papua New Guinea", "Port Maresby", "Oceania");
        Country ph = new Country("ph", "Philippines", "Manila", "Asia");
        Country pk = new Country("pk", "Pakistan", "Islamabad", "Asia");
        Country pl = new Country("pl", "Poland", "Warsaw", "Europe");
        Country pt = new Country("pt", "Portugal", "Lisbon", "Europe");
        Country pw = new Country("pw", "Palau", "Melekeok", "Oceania");
        Country py = new Country("py", "Paraguay", "Asuncion", "South America");
        Country qa = new Country("qa", "Qatar", "Doha", "Asia");
        Country ro = new Country("ro", "Romania", "Bucharest", "Europe");
        Country rs = new Country("rs", "Serbia", "Belgrade", "Europe");
        Country ru = new Country("ru", "Russia", "Moscow", "Europe");
        Country rw = new Country("rw", "Rwanda", "Kigali", "Africa");
        Country sa = new Country("sa", "Saudia Arabia", "Riyadh", "Asia");
        Country sb = new Country("sb", "Solomon Islands", "Honiara", "Oceania");
        Country sc = new Country("sc", "Seychelles", "Victoria", "Africa");
        Country sd = new Country("sd", "Sudan", "Khartoum", "Africa");
        Country se = new Country("se", "Sweden", "Stockholm", "Europe");
        Country sg = new Country("sg", "Singapore", "Singapore", "Asia");
        Country si = new Country("si", "Slovania", "Ljubljana", "Europe");
        Country sk = new Country("sk", "Slovakia", "Bratislava", "Europe");
        Country sl = new Country("sl", "Sierra Leone", "Freetown", "Africa");
        Country sm = new Country("sm", "San Marino", "San Marino", "Europe");
        Country sn = new Country("sn", "Senegal", "Dakar", "Africa");
        Country so = new Country("so", "Somalia", "Mogadishu", "Africa");
        Country sr = new Country("sr", "Suriname", "Paramaribo", "South America");
        Country st = new Country("st", "São Tomé and Príncipe", "São Tomé", "Africa");
        Country sv = new Country("sv", "El Salvador", "San Salvador", "North America");
        Country sy = new Country("sy", "Syria", "Damascus", "Asia");
        Country sz = new Country("sz", "Swaziland", "Mbabane", "Africa");
        Country td = new Country("td", "Chad", "N'Djamena", "Africa");
        Country tg = new Country("tg", "Togo", "Lome", "Africa");
        Country th = new Country("th", "Thailand", "Bangkok", "Asia");
        Country tj = new Country("tj", "Tajikistan", "Dushanbe", "Asia");
        Country tl = new Country("tl", "Timor-Leste", "Dili", "Asia");
        Country tm = new Country("tm", "Turkmenistan", "Ashgabat", "Asia");
        Country tn = new Country("tn", "Tunisia", "Tunis", "Africa");
        Country to = new Country("to", "Tonga", "Nuku'alofa", "Oceania");
        Country tr = new Country("tr", "Turkey", "Ankara", "Asia");
        Country tt = new Country("tt", "Trindad and Tobago", "Port of Spain", "North America");
        Country tv = new Country("tv", "Tuvalu", "Funafuti", "Oceania");
        Country tw = new Country("tw", "Taiwan", "Taipei", "Asia");
        Country tz = new Country("tz", "Tanzania", "Dar es Salaam", "Africa");
        Country ua = new Country("ua", "Ukraine", "Kyiv", "Europe");
        Country ug = new Country("ug", "Uganda", "Kampala", "Africa");
        Country us = new Country("us", "United States", "Washington, D.C.", "North America");
        Country uy = new Country("uy", "Uruguay", "Montevideo", "South America");
        Country uz = new Country("uz", "Uzbekistan", "Tashkent", "Asia");
        Country va = new Country("va", "Vatican City", "Vatican City", "Europe");
        Country vc = new Country("vc", "Saint Vincent and the Grenatines", "Kingstown", "North America");
        Country ve = new Country("ve", "Venezuela", "Caraca", "South America");
        Country vn = new Country("vn", "Vietnam", "Hanoi", "Asia");
        Country vu = new Country("vu", "Vanuatu", "Port-Vila", "Oceania");
        Country ws = new Country("ws", "Samoa", "Apia", "Oceania");
        Country ye = new Country("ye", "Yemen", "Sanaa", "Asia");
        Country za = new Country("za", "South Africa", "Pretoria", "Africa");
        Country zm = new Country("zm", "Zambia", "Lusaka", "Africa");
        Country zw = new Country("zw", "Zimbabwe", "Harare", "Africa");


        countryInfo.put(0, ad);
        countryInfo.put(1, ae);
        countryInfo.put(2, af);
        countryInfo.put(3, ag);
        countryInfo.put(4, al);
        countryInfo.put(5, am);
        countryInfo.put(6, ao);
        countryInfo.put(7, ar);
        countryInfo.put(8, at);
        countryInfo.put(9, au);
        countryInfo.put(10, az);
        countryInfo.put(11, ba);
        countryInfo.put(12, bb);
        countryInfo.put(13, bd);
        countryInfo.put(14, be);
        countryInfo.put(15, bf);
        countryInfo.put(16, bg);
        countryInfo.put(17, bh);
        countryInfo.put(18, bi);
        countryInfo.put(19, bj);
        countryInfo.put(20, bn);
        countryInfo.put(21, bo);
        countryInfo.put(22, br);
        countryInfo.put(23, bs);
        countryInfo.put(24, bt);
        countryInfo.put(25, bw);
        countryInfo.put(26, by);
        countryInfo.put(27, bz);
        countryInfo.put(28, ca);
        countryInfo.put(29, cd);
        countryInfo.put(30, cf);
        countryInfo.put(31, cg);
        countryInfo.put(32, ch);
        countryInfo.put(33, ci);
        countryInfo.put(195, cl);
        countryInfo.put(34, cm);
        countryInfo.put(35, cn);
        countryInfo.put(36, co);
        countryInfo.put(37, cr);
        countryInfo.put(38, cu);
        countryInfo.put(39, cv);
        countryInfo.put(40, cy);
        countryInfo.put(41, cz);
        countryInfo.put(42, de);
        countryInfo.put(43, dj);
        countryInfo.put(44, dk);
        countryInfo.put(45, dm);
        countryInfo.put(46, dominican);
        countryInfo.put(47, dz);
        countryInfo.put(48, ec);
        countryInfo.put(49, ee);
        countryInfo.put(50, eg);
        countryInfo.put(51, eh);
        countryInfo.put(52, er);
        countryInfo.put(53, es);
        countryInfo.put(54, et);
        countryInfo.put(55, fi);
        countryInfo.put(56, fj);
        countryInfo.put(57, fm);
        countryInfo.put(58, fr);
        countryInfo.put(59, ga);
        countryInfo.put(60, gb);
        countryInfo.put(61, gd);
        countryInfo.put(62, ge);
        countryInfo.put(63, gh);
        countryInfo.put(64, gm);
        countryInfo.put(65, gn);
        countryInfo.put(66, gq);
        countryInfo.put(67, gr);
        countryInfo.put(68, gt);
        countryInfo.put(69, gw);
        countryInfo.put(70, gy);
        countryInfo.put(71, hn);
        countryInfo.put(72, hr);
        countryInfo.put(73, ht);
        countryInfo.put(74, hu);
        countryInfo.put(75, id);
        countryInfo.put(76, ie);
        countryInfo.put(77, il);
        countryInfo.put(78, in);
        countryInfo.put(79, iq);
        countryInfo.put(80, ir);
        countryInfo.put(81, is);
        countryInfo.put(82, it);
        countryInfo.put(83, jm);
        countryInfo.put(84, jo);
        countryInfo.put(85, jp);
        countryInfo.put(86, ke);
        countryInfo.put(87, kg);
        countryInfo.put(88, kh);
        countryInfo.put(89, ki);
        countryInfo.put(90, km);
        countryInfo.put(91, kn);
        countryInfo.put(92, kp);
        countryInfo.put(93, kr);
        countryInfo.put(94, ks);
        countryInfo.put(95, kw);
        countryInfo.put(96, kz);
        countryInfo.put(97, la);
        countryInfo.put(98, lb);
        countryInfo.put(99, lc);
        countryInfo.put(100,li);
        countryInfo.put(101,lk);
        countryInfo.put(102, lr);
        countryInfo.put(103, ls);
        countryInfo.put(104, lt);
        countryInfo.put(105, lu);
        countryInfo.put(106, lv);
        countryInfo.put(107, ly);
        countryInfo.put(108, ma);
        countryInfo.put(109, mc);
        countryInfo.put(110, md);
        countryInfo.put(111, me);
        countryInfo.put(112, mg);
        countryInfo.put(113, mh);
        countryInfo.put(114, mk);
        countryInfo.put(115, ml);
        countryInfo.put(116, mm);
        countryInfo.put(117, mn);
        countryInfo.put(118, mr);
        countryInfo.put(119, mt);
        countryInfo.put(120, mu);
        countryInfo.put(121, mv);
        countryInfo.put(122, mw);
        countryInfo.put(123, mx);
        countryInfo.put(124, my);
        countryInfo.put(125, mz);
        countryInfo.put(126, na);
        countryInfo.put(127, ne);
        countryInfo.put(128, ng);
        countryInfo.put(129, ni);
        countryInfo.put(130, nl);
        countryInfo.put(131, no);
        countryInfo.put(132, np);
        countryInfo.put(133, nr);
        countryInfo.put(134, nz);
        countryInfo.put(135, om);
        countryInfo.put(136, pa);
        countryInfo.put(137, pe);
        countryInfo.put(138, pg);
        countryInfo.put(139, ph);
        countryInfo.put(140, pk);
        countryInfo.put(141, pl);
        countryInfo.put(142, pt);
        countryInfo.put(143, pw);
        countryInfo.put(144, py);
        countryInfo.put(145, qa);
        countryInfo.put(146, ro);
        countryInfo.put(147, rs);
        countryInfo.put(148, ru);
        countryInfo.put(149, rw);
        countryInfo.put(150, sa);
        countryInfo.put(151, sb);
        countryInfo.put(152, sc);
        countryInfo.put(153, sd);
        countryInfo.put(154, se);
        countryInfo.put(155, sg);
        countryInfo.put(156, si);
        countryInfo.put(157, sk);
        countryInfo.put(158, sl);
        countryInfo.put(159, sm);
        countryInfo.put(160, sn);
        countryInfo.put(161, so);
        countryInfo.put(162, sr);
        countryInfo.put(163, st);
        countryInfo.put(164, sv);
        countryInfo.put(165, sy);
        countryInfo.put(166, sz);
        countryInfo.put(167, td);
        countryInfo.put(168, tg);
        countryInfo.put(169, th);
        countryInfo.put(170, tj);
        countryInfo.put(171, tl);
        countryInfo.put(172, tm);
        countryInfo.put(173, tn);
        countryInfo.put(174, to);
        countryInfo.put(175, tr);
        countryInfo.put(176, tt);
        countryInfo.put(177, tv);
        countryInfo.put(178, tw);
        countryInfo.put(179, tz);
        countryInfo.put(180, ua);
        countryInfo.put(181, ug);
        countryInfo.put(182, us);
        countryInfo.put(183, uy);
        countryInfo.put(184, uz);
        countryInfo.put(185, va);
        countryInfo.put(186, vc);
        countryInfo.put(187, ve);
        countryInfo.put(188, vn);
        countryInfo.put(189, vu);
        countryInfo.put(190, ws);
        countryInfo.put(191, ye);
        countryInfo.put(192, za);
        countryInfo.put(193, zm);
        countryInfo.put(194, zw);

        int europeCount = 0;
        for( int x = 0; x < 196; x++){
            String country_continent_name= countryInfo.get(x).continent;
            if(country_continent_name == "Europe"){
                europeCountryInfo.put(europeCount,countryInfo.get(x));
                europeCount++;
            }
        }

        int africaCount = 0;
        for( int x = 0; x < 196; x++){
            String country_continent_name= countryInfo.get(x).continent;
            if(country_continent_name == "Africa"){
                africaCountryInfo.put(africaCount,countryInfo.get(x));
                africaCount++;
            }
        }

        int asiaCount = 0;
        for( int x = 0; x < 196; x++){
            String country_continent_name= countryInfo.get(x).continent;
            if(country_continent_name == "Asia"){
                asiaCountryInfo.put(asiaCount,countryInfo.get(x));
                asiaCount++;
            }
        }

        int northAmericaCount = 0;
        for( int x = 0; x < 196; x++){
            String country_continent_name= countryInfo.get(x).continent;
            if(country_continent_name == "North America"){
                northAmericaCountryInfo.put(northAmericaCount,countryInfo.get(x));
                northAmericaCount++;
            }
        }

        int southAmericaCount = 0;
        for( int x = 0; x < 196; x++){
            String country_continent_name= countryInfo.get(x).continent;
            if(country_continent_name == "South America"){
                southAmericaCountryInfo.put(southAmericaCount,countryInfo.get(x));
                southAmericaCount++;
            }
        }

        int oceaniaCount = 0;
        for( int x = 0; x < 196; x++){
            String country_continent_name= countryInfo.get(x).continent;
            if(country_continent_name == "Oceania"){
                oceaniaCountryInfo.put(oceaniaCount,countryInfo.get(x));
                oceaniaCount++;
            }
        }






        normalModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);

                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 String country_continent_name = "";
                                                 int[] gotItArray = new int[196];
                                                 int gotItCount = 0;
                                                 int arraySize = 196;
                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,195);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,195);
                                                             }
                                                             country_path_name= countryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= countryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= countryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 3;
                                                             break;
                                                         case 3:
                                                             country_continent_name= countryInfo.get(flag_number).continent;
                                                             countryContinentTextView.setText("\n Continent: " + country_continent_name);
                                                             countryContinentTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryContinentTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );


        europeanCountryModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);
                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 int[] gotItArray = new int[47];
                                                 int gotItCount = 0;
                                                 int arraySize = 47;

                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,46);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,46);
                                                             }
                                                             country_path_name= europeCountryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= europeCountryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= europeCountryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );

        africanCountryModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);
                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 int[] gotItArray = new int[54];
                                                 int gotItCount = 0;
                                                 int arraySize = 54;
                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,53);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,53);
                                                             }
                                                             country_path_name= africaCountryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= africaCountryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= africaCountryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );

        asianCountryModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);
                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 int[] gotItArray = new int[44];
                                                 int gotItCount = 0;
                                                 int arraySize = 44;

                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,43);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,43);
                                                             }
                                                             country_path_name= asiaCountryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= asiaCountryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= asiaCountryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );

        northAmericanCountryModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);
                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 int[] gotItArray = new int[23];
                                                 int gotItCount = 0;
                                                 int arraySize = 23;

                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,22);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,22);
                                                             }
                                                             country_path_name= northAmericaCountryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= northAmericaCountryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= northAmericaCountryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );

        southAmericanCountryModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);
                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 int[] gotItArray = new int[12];
                                                 int gotItCount = 0;
                                                 int arraySize = 12;

                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,11);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,11);
                                                             }
                                                             country_path_name= southAmericaCountryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount ++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= southAmericaCountryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= southAmericaCountryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );

        oceanianCountryModeButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        countryNameTextView.setText("");
                        countryCapitalTextView.setText("");
                        countryContinentTextView.setText("");
                        backButton.setEnabled(true);
                        backButton.setVisibility(View.VISIBLE);
                        backButton.setOnClickListener(
                                new Button.OnClickListener(){
                                    public void onClick(View v){
                                        normalModeButton.setEnabled(true);
                                        normalModeButton.setVisibility(View.VISIBLE);
                                        europeanCountryModeButton.setEnabled(true);
                                        europeanCountryModeButton.setVisibility(View.VISIBLE);
                                        asianCountryModeButton.setEnabled(true);
                                        asianCountryModeButton.setVisibility(View.VISIBLE);
                                        africanCountryModeButton.setEnabled(true);
                                        africanCountryModeButton.setVisibility(View.VISIBLE);
                                        northAmericanCountryModeButton.setEnabled(true);
                                        northAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        southAmericanCountryModeButton.setEnabled(true);
                                        southAmericanCountryModeButton.setVisibility(View.VISIBLE);
                                        oceanianCountryModeButton.setEnabled(true);
                                        oceanianCountryModeButton.setVisibility(View.VISIBLE);
                                        backButton.setEnabled(false);
                                        backButton.setVisibility(View.INVISIBLE);
                                        gotItButton.setEnabled(false);
                                        gotItButton.setVisibility(View.INVISIBLE);
                                        l.setOnClickListener(null);
                                        countryNameTextView.setText("CHOOSE");
                                        countryCapitalTextView.setText("YOUR");
                                        countryContinentTextView.setText("MODE");
                                        countryFlagImageView.setImageResource(0);

                                    }
                                }
                        );
                        normalModeButton.setEnabled(false);
                        normalModeButton.setVisibility(View.INVISIBLE);
                        europeanCountryModeButton.setEnabled(false);
                        europeanCountryModeButton.setVisibility(View.INVISIBLE);
                        asianCountryModeButton.setEnabled(false);
                        asianCountryModeButton.setVisibility(View.INVISIBLE);
                        africanCountryModeButton.setEnabled(false);
                        africanCountryModeButton.setVisibility(View.INVISIBLE);
                        northAmericanCountryModeButton.setEnabled(false);
                        northAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        southAmericanCountryModeButton.setEnabled(false);
                        southAmericanCountryModeButton.setVisibility(View.INVISIBLE);
                        oceanianCountryModeButton.setEnabled(false);
                        oceanianCountryModeButton.setVisibility(View.INVISIBLE);
                        l.setOnClickListener(new View.OnClickListener(){

                                                 int flag_number;
                                                 String country_path_name = "";
                                                 String country_name = "";
                                                 String country_capital_name = "";
                                                 int[] gotItArray = new int[14];
                                                 int gotItCount = 0;
                                                 int arraySize = 14;

                                                 int res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                 int currentState = 0;

                                                 public void onClick(View v){
                                                     switch (currentState) {
                                                         case 0:
                                                             flag_number = randInt(0,13);
                                                             while(valueCheck(flag_number, gotItArray, arraySize)){
                                                                 flag_number = randInt(0,13);
                                                             }
                                                             country_path_name= oceaniaCountryInfo.get(flag_number).path;
                                                             res = getResources().getIdentifier(country_path_name, "drawable", "countries.countryapp");
                                                             countryFlagImageView.setImageResource(res);
                                                             countryFlagImageView.getLayoutParams().height = 300;
                                                             countryFlagImageView.requestLayout();
                                                             countryNameTextView.setText("");
                                                             countryCapitalTextView.setText("");
                                                             countryContinentTextView.setText("");
                                                             currentState = 1;
                                                             gotItButton.setEnabled(true);
                                                             gotItButton.setVisibility(View.VISIBLE);
                                                             gotItButton.setOnClickListener(
                                                                     new Button.OnClickListener(){
                                                                         public void onClick(View v){
                                                                             gotItArray[gotItCount] = flag_number;
                                                                             gotItCount++;
                                                                             countryNameTextView.setText("");
                                                                             countryCapitalTextView.setText("");
                                                                             countryContinentTextView.setText("");
                                                                             countryFlagImageView.setImageResource(0);
                                                                             currentState = 0;
                                                                             gotItButton.setEnabled(false);
                                                                             gotItButton.setVisibility(View.INVISIBLE);
                                                                         }
                                                                     }
                                                             );
                                                             break;
                                                         case 1:
                                                             country_name= oceaniaCountryInfo.get(flag_number).name;
                                                             countryNameTextView.setText("\n\n\n Country: " + country_name);
                                                             countryNameTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryNameTextView.setTextSize(20);
                                                             currentState = 2;
                                                             break;
                                                         case 2:
                                                             country_capital_name= oceaniaCountryInfo.get(flag_number).capitalName;
                                                             countryCapitalTextView.setText("\n Capital: " + country_capital_name);
                                                             countryCapitalTextView.setTextColor(Color.parseColor("#000000"));
                                                             countryCapitalTextView.setTextSize(20);
                                                             currentState= 0;
                                                             break;
                                                     }




                                                 }
                                             }
                        );
                    }
                }
        );
    }

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();


        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static boolean valueCheck(int number, int[] valueArray, int arraySize) {
        boolean check = false;
        for(int x = 0; x < arraySize; x++){
            if(number == valueArray[x]){
                check = true;
            }
        }

        return check;
    }



}

