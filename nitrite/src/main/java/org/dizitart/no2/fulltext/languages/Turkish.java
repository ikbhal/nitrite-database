/*
 *
 * Copyright 2017 Nitrite author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.dizitart.no2.fulltext.languages;

import org.dizitart.no2.fulltext.Language;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Turkish stop words
 *
 * @since 2.1.0
 * @author Anindya Chatterjee
 */
public class Turkish implements Language {
    @Override
    public Set<String> stopWords() {
        return new HashSet<>(Arrays.asList(
                "acaba",
                "acep",
                "adamakıllı",
                "adeta",
                "ait",
                "altmýþ",
                "altmış",
                "altý",
                "altı",
                "ama",
                "amma",
                "anca",
                "ancak",
                "arada",
                "artýk",
                "aslında",
                "aynen",
                "ayrıca",
                "az",
                "açıkça",
                "açıkçası",
                "bana",
                "bari",
                "bazen",
                "bazý",
                "bazı",
                "başkası",
                "baţka",
                "belki",
                "ben",
                "benden",
                "beni",
                "benim",
                "beri",
                "beriki",
                "beþ",
                "beş",
                "beţ",
                "bilcümle",
                "bile",
                "bin",
                "binaen",
                "binaenaleyh",
                "bir",
                "biraz",
                "birazdan",
                "birbiri",
                "birden",
                "birdenbire",
                "biri",
                "birice",
                "birileri",
                "birisi",
                "birkaç",
                "birkaçı",
                "birkez",
                "birlikte",
                "birçok",
                "birçoğu",
                "birþey",
                "birþeyi",
                "birşey",
                "birşeyi",
                "birţey",
                "bitevi",
                "biteviye",
                "bittabi",
                "biz",
                "bizatihi",
                "bizce",
                "bizcileyin",
                "bizden",
                "bize",
                "bizi",
                "bizim",
                "bizimki",
                "bizzat",
                "boşuna",
                "bu",
                "buna",
                "bunda",
                "bundan",
                "bunlar",
                "bunları",
                "bunların",
                "bunu",
                "bunun",
                "buracıkta",
                "burada",
                "buradan",
                "burası",
                "böyle",
                "böylece",
                "böylecene",
                "böylelikle",
                "böylemesine",
                "böylesine",
                "büsbütün",
                "bütün",
                "cuk",
                "cümlesi",
                "da",
                "daha",
                "dahi",
                "dahil",
                "dahilen",
                "daima",
                "dair",
                "dayanarak",
                "de",
                "defa",
                "dek",
                "demin",
                "demincek",
                "deminden",
                "denli",
                "derakap",
                "derhal",
                "derken",
                "deđil",
                "değil",
                "değin",
                "diye",
                "diđer",
                "diğer",
                "diğeri",
                "doksan",
                "dokuz",
                "dolayı",
                "dolayısıyla",
                "doğru",
                "dört",
                "edecek",
                "eden",
                "ederek",
                "edilecek",
                "ediliyor",
                "edilmesi",
                "ediyor",
                "elbet",
                "elbette",
                "elli",
                "emme",
                "en",
                "enikonu",
                "epey",
                "epeyce",
                "epeyi",
                "esasen",
                "esnasında",
                "etmesi",
                "etraflı",
                "etraflıca",
                "etti",
                "ettiği",
                "ettiğini",
                "evleviyetle",
                "evvel",
                "evvela",
                "evvelce",
                "evvelden",
                "evvelemirde",
                "evveli",
                "eđer",
                "eğer",
                "fakat",
                "filanca",
                "gah",
                "gayet",
                "gayetle",
                "gayri",
                "gayrı",
                "gelgelelim",
                "gene",
                "gerek",
                "gerçi",
                "geçende",
                "geçenlerde",
                "gibi",
                "gibilerden",
                "gibisinden",
                "gine",
                "göre",
                "gırla",
                "hakeza",
                "halbuki",
                "halen",
                "halihazırda",
                "haliyle",
                "handiyse",
                "hangi",
                "hangisi",
                "hani",
                "hariç",
                "hasebiyle",
                "hasılı",
                "hatta",
                "hele",
                "hem",
                "henüz",
                "hep",
                "hepsi",
                "her",
                "herhangi",
                "herkes",
                "herkesin",
                "hiç",
                "hiçbir",
                "hiçbiri",
                "hoş",
                "hulasaten",
                "iken",
                "iki",
                "ila",
                "ile",
                "ilen",
                "ilgili",
                "ilk",
                "illa",
                "illaki",
                "imdi",
                "indinde",
                "inen",
                "insermi",
                "ise",
                "ister",
                "itibaren",
                "itibariyle",
                "itibarıyla",
                "iyi",
                "iyice",
                "iyicene",
                "için",
                "iş",
                "işte",
                "iţte",
                "kadar",
                "kaffesi",
                "kah",
                "kala",
                "kanýmca",
                "karşın",
                "katrilyon",
                "kaynak",
                "kaçı",
                "kelli",
                "kendi",
                "kendilerine",
                "kendini",
                "kendisi",
                "kendisine",
                "kendisini",
                "kere",
                "kez",
                "keza",
                "kezalik",
                "keşke",
                "keţke",
                "ki",
                "kim",
                "kimden",
                "kime",
                "kimi",
                "kimisi",
                "kimse",
                "kimsecik",
                "kimsecikler",
                "külliyen",
                "kýrk",
                "kýsaca",
                "kırk",
                "kısaca",
                "lakin",
                "leh",
                "lütfen",
                "maada",
                "madem",
                "mademki",
                "mamafih",
                "mebni",
                "međer",
                "meğer",
                "meğerki",
                "meğerse",
                "milyar",
                "milyon",
                "mu",
                "mü",
                "mý",
                "mı",
                "nasýl",
                "nasıl",
                "nasılsa",
                "nazaran",
                "naşi",
                "ne",
                "neden",
                "nedeniyle",
                "nedenle",
                "nedense",
                "nerde",
                "nerden",
                "nerdeyse",
                "nere",
                "nerede",
                "nereden",
                "neredeyse",
                "neresi",
                "nereye",
                "netekim",
                "neye",
                "neyi",
                "neyse",
                "nice",
                "nihayet",
                "nihayetinde",
                "nitekim",
                "niye",
                "niçin",
                "o",
                "olan",
                "olarak",
                "oldu",
                "olduklarını",
                "oldukça",
                "olduğu",
                "olduğunu",
                "olmadı",
                "olmadığı",
                "olmak",
                "olması",
                "olmayan",
                "olmaz",
                "olsa",
                "olsun",
                "olup",
                "olur",
                "olursa",
                "oluyor",
                "on",
                "ona",
                "onca",
                "onculayın",
                "onda",
                "ondan",
                "onlar",
                "onlardan",
                "onlari",
                "onlarýn",
                "onları",
                "onların",
                "onu",
                "onun",
                "oracık",
                "oracıkta",
                "orada",
                "oradan",
                "oranca",
                "oranla",
                "oraya",
                "otuz",
                "oysa",
                "oysaki",
                "pek",
                "pekala",
                "peki",
                "pekçe",
                "peyderpey",
                "rağmen",
                "sadece",
                "sahi",
                "sahiden",
                "sana",
                "sanki",
                "sekiz",
                "seksen",
                "sen",
                "senden",
                "seni",
                "senin",
                "siz",
                "sizden",
                "sizi",
                "sizin",
                "sonra",
                "sonradan",
                "sonraları",
                "sonunda",
                "tabii",
                "tam",
                "tamam",
                "tamamen",
                "tamamıyla",
                "tarafından",
                "tek",
                "trilyon",
                "tüm",
                "var",
                "vardı",
                "vasıtasıyla",
                "ve",
                "velev",
                "velhasıl",
                "velhasılıkelam",
                "veya",
                "veyahut",
                "ya",
                "yahut",
                "yakinen",
                "yakında",
                "yakından",
                "yakınlarda",
                "yalnız",
                "yalnızca",
                "yani",
                "yapacak",
                "yapmak",
                "yaptı",
                "yaptıkları",
                "yaptığı",
                "yaptığını",
                "yapılan",
                "yapılması",
                "yapıyor",
                "yedi",
                "yeniden",
                "yenilerde",
                "yerine",
                "yetmiþ",
                "yetmiş",
                "yetmiţ",
                "yine",
                "yirmi",
                "yok",
                "yoksa",
                "yoluyla",
                "yüz",
                "yüzünden",
                "zarfında",
                "zaten",
                "zati",
                "zira",
                "çabuk",
                "çabukça",
                "çeşitli",
                "çok",
                "çokları",
                "çoklarınca",
                "çokluk",
                "çoklukla",
                "çokça",
                "çoğu",
                "çoğun",
                "çoğunca",
                "çoğunlukla",
                "çünkü",
                "öbür",
                "öbürkü",
                "öbürü",
                "önce",
                "önceden",
                "önceleri",
                "öncelikle",
                "öteki",
                "ötekisi",
                "öyle",
                "öylece",
                "öylelikle",
                "öylemesine",
                "öz",
                "üzere",
                "üç",
                "þey",
                "þeyden",
                "þeyi",
                "þeyler",
                "þu",
                "þuna",
                "þunda",
                "þundan",
                "þunu",
                "şayet",
                "şey",
                "şeyden",
                "şeyi",
                "şeyler",
                "şu",
                "şuna",
                "şuncacık",
                "şunda",
                "şundan",
                "şunlar",
                "şunları",
                "şunu",
                "şunun",
                "şura",
                "şuracık",
                "şuracıkta",
                "şurası",
                "şöyle",
                "ţayet",
                "ţimdi",
                "ţu",
                "ţöyle"
        ));
    }
}
