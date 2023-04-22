import java.util.ArrayList;
import java.util.Random;



public class myenviroment{
    static Random generator; 

    static String[] names = {"Darrell","Giancarlo","Elisha","Junior","Zackery","Alvaro","Lewis","Valentin","Deacon","Jase","Harry","Kendall","Rashad","Finnegan","Mohammed","Ramiro","Cedric","Brennen","Santino","Stanley","Tyrone","Chace","Francis","Johnathon","Teagan","Zechariah","Alonso","Kaeden","Kamden","Gilberto","Ray","Karter","Luciano","Nico","Kole","Aryan","Draven","Jamie","Misael","Lee","Alexzander","Camren","Giovanny","Amare","Rhett","Rhys","Rodolfo","Nash","Markus","Deven","Mohammad","Moshe","Quintin","Dwayne","Memphis","Atticus","Davian","Eugene","Jax","Antoine","Wayne","Randall","Semaj","Uriah","Clark","Aidyn","Jorden","Maxim","Aditya","Lawson","Messiah","Korbin","Sullivan","Freddy","Demarcus","Neil","Brice","King","Davon","Elvis","Ace","Dexter","Heath","Duncan","Jamar","Sincere","Irvin","Remington","Kadin","Soren","Tyree","Damarion","Talan","Adrien","Gilbert","Keenan","Darnell","Adolfo","Tristian","Derick","Isai","Rylee","Gauge","Harold","Kareem","Deangelo","Agustin","Coleman","Zavier","Lamar","Emery","Jaydin","Devan","Jordyn","Mathias","Prince","Sage","Seamus","Jasiah","Efrain","Darryl","Arjun","Mike","Roland","Conrad","Kamron","Hamza","Santos","Frankie","Dominique","Marley","Vance","Dax","Jamir","Kylan","Todd","Maximo","Jabari","Matthias","Haiden","Luka","Marcelo","Keon","Layton","Tyrell","Kash","Raiden","Cullen","Donte","Jovani","Cordell","Kasen","Rory","Alfred","Darwin","Ernest","Bailey","Gaige","Hassan","Jamarcus","Killian","Augustus","Trevin","Zain","Ellis","Rex","Yusuf","Bruno","Jaidyn","Justus","Ronin","Humberto","Jaquan","Josh","Kasey","Winston","Dashawn","Lucian","Matias","Sidney","Ignacio","Nigel","Van","Elian","Finley","Jaron","Addison","Aedan","Braedon","Jadyn","Konner","Zayne","Franco","Niko","Savion","Cristofer","Deon","Krish","Anton","Brogan","Cael","Coby","Kymani","Marcel","Yair","Dale","Bo","Jordon","Samir","Darien","Zaire","Ross","Vaughn","Devyn","Kenyon","Clay","Dario","Ishaan","Jair","Kael","Adonis","Jovanny","Clinton","Rey","Chaim","German","Harper","Nathen","Rigoberto","Sonny","Glenn","Octavio","Blaze","Keshawn","Ralph","Ean","Nikhil","Rayan","Sterling","Branson","Jadiel","Dillan","Jeramiah","Koen","Konnor","Antwan","Houston","Tyrese","Dereon","Leonidas","Zack","Fisher","Jaydan","Quinten","Nick","Urijah","Darion","Jovan","Salvatore","Beckham","Jarrett","Antony","Eden","Makai","Zaiden","Broderick","Camryn","Malaki","Nikolai","Howard","Immanuel","Demarion","Valentino","Jovanni","Ayaan","Ethen","Leandro","Royce","Yael","Yosef","Jean","Marquise","Alden","Leroy","Gaven","Jovany","Tyshawn","Aarav","Kadyn","Milton","Zaid","Kelton","Tripp","Kamren","Slade","Hezekiah","Jakobe","Nathanial","Rishi","Shamar","Geovanni","Pranav","Roderick","Bentley","Clarence","Lyric","Bernard","Carmelo","Denzel","Maximillian","Reynaldo","Cassius","Gordon","Reuben","Samson","Yadiel","Jayvon","Reilly","Sheldon","Abdullah","Jagger","Thaddeus","Case","Kyson","Lamont","Chaz","Makhi","Jan","Marques","Oswaldo","Donavan","Keyon","Kyan","Simeon","Trystan","Andreas","Dangelo","Landin","Reagan","Turner","Arnav","Brenton","Callum","Jayvion","Bridger","Sammy","Deegan","Jaylan","Lennon","Odin","Abdiel","Jerimiah","Eliezer","Bronson","Cornelius","Pierre","Cortez","Baron","Carlo","Carsen","Fletcher","Izayah","Kolten","Damari","Hugh","Jensen","Yurem", "Emma","Isabella","Emily","Madison","Ava","Olivia","Sophia","Abigail","Elizabeth","Chloe","Samantha","Addison","Natalie","Mia","Alexis","Alyssa","Hannah","Ashley","Ella","Sarah","Grace","Taylor","Brianna","Lily","Hailey","Anna","Victoria","Kayla","Lillian","Lauren","Kaylee","Allison","Savannah","Nevaeh","Gabriella","Sofia","Makayla","Avery","Riley","Julia","Leah","Aubrey","Jasmine","Audrey","Katherine","Morgan","Brooklyn","Destiny","Sydney","Alexa","Kylie","Brooke","Kaitlyn","Evelyn","Layla","Madeline","Kimberly","Zoe","Jessica","Peyton","Alexandra","Claire","Madelyn","Maria","Mackenzie","Arianna","Jocelyn","Amelia","Angelina","Trinity","Andrea","Maya","Valeria","Sophie","Rachel","Vanessa","Aaliyah","Mariah","Gabrielle","Katelyn","Ariana","Bailey","Camila","Jennifer","Melanie","Gianna","Charlotte","Paige","Autumn","Payton","Faith","Sara","Isabelle","Caroline","Genesis","Isabel","Mary","Zoey","Gracie","Megan","Haley","Mya","Michelle","Molly","Stephanie","Nicole","Jenna","Natalia","Sadie","Jada","Serenity","Lucy","Ruby","Eva","Kennedy","Rylee","Jayla","Naomi","Rebecca","Lydia","Daniela","Bella","Keira","Adriana","Lilly","Hayden","Miley","Katie","Jade","Jordan","Gabriela","Amy","Angela","Melissa","Valerie","Giselle","Diana","Amanda","Kate","Laila","Reagan","Jordyn","Kylee","Danielle","Briana","Marley","Leslie","Kendall","Catherine","Liliana","Mckenzie","Jacqueline","Ashlyn","Reese","Marissa","London","Juliana","Shelby","Cheyenne","Angel","Daisy","Makenzie","Miranda","Erin","Amber","Alana","Ellie","Breanna","Ana","Mikayla","Summer","Piper","Adrianna","Jillian","Sierra","Jayden","Sienna","Alicia","Lila","Margaret","Alivia","Brooklynn","Karen","Violet","Sabrina","Stella","Aniyah","Annabelle","Alexandria","Kathryn","Skylar","Aliyah","Delilah","Julianna","Kelsey","Khloe","Carly","Amaya","Mariana","Christina","Alondra","Tessa","Eliana","Bianca","Jazmin","Clara","Vivian","Josephine","Delaney","Scarlett","Elena","Cadence","Alexia","Maggie","Laura","Nora","Ariel","Elise","Nadia","Mckenna","Chelsea","Lyla","Alaina","Jasmin","Hope","Leila","Caitlyn","Cassidy","Makenna","Allie","Izabella","Eden","Callie","Haylee","Caitlin","Kendra","Karina","Kyra","Kayleigh","Addyson","Kiara","Jazmine","Karla","Camryn","Alina","Lola","Kyla","Kelly","Fatima","Tiffany","Kira","Crystal","Mallory","Esmeralda","Alejandra","Eleanor","Angelica","Jayda","Abby","Kara","Veronica","Carmen","Jamie","Ryleigh","Valentina","Allyson","Dakota","Kamryn","Courtney","Cecilia","Madeleine","Aniya","Alison","Esther","Heaven","Aubree","Lindsey","Leilani","Nina","Melody","Macy","Ashlynn","Joanna","Cassandra","Alayna","Kaydence","Madilyn","Aurora","Heidi","Emerson","Kimora","Madalyn","Erica","Josie","Katelynn","Guadalupe","Harper","Ivy","Lexi","Camille","Savanna","Dulce","Daniella","Lucia","Emely","Joselyn","Kiley","Kailey","Miriam","Cynthia","Rihanna","Georgia","Rylie","Harmony","Kiera","Kyleigh","Monica","Bethany","Kaylie","Cameron","Teagan","Cora","Brynn","Ciara","Genevieve","Alice","Maddison","Eliza","Tatiana","Jaelyn","Erika","Ximena","April","Marely","Julie","Danica","Presley","Brielle","Julissa","Angie","Iris","Brenda","Hazel","Rose","Malia","Shayla","Fiona","Phoebe","Nayeli","Paola","Kaelyn","Selena","Audrina","Rebekah","Carolina","Janiyah","Michaela","Penelope","Janiya","Anastasia","Adeline","Ruth","Sasha","Denise","Holly","Madisyn","Hanna","Tatum","Marlee","Nataly","Helen","Janelle","Lizbeth","Serena","Anya","Jaslene","Kaylin","Jazlyn","Nancy","Lindsay","Desiree","Hayley","Itzel","Imani","Madelynn","Asia","Kadence","Madyson","Talia","Jane","Kayden","Annie","Amari","Bridget","Raegan","Jadyn","Celeste","Jimena","Luna","Yasmin","Emilia","Annika","Estrella","Sarai","Lacey","Ayla","Alessandra","Willow","Nyla","Dayana","Lilah","Lilliana","Natasha","Hadley","Harley","Priscilla","Claudia","Allisson","Baylee","Brenna","Brittany","Skyler","Fernanda","Danna","Melany","Cali","Lia","Macie","Lyric","Logan","Gloria","Lana","Mylee","Cindy","Lilian","Amira","Anahi","Alissa","Anaya","Lena","Ainsley","Sandra","Noelle","Marisol","Meredith","Kailyn","Lesly","Johanna","Diamond","Evangeline","Juliet","Kathleen","Meghan","Paisley","Athena","Hailee","Rosa","Wendy","Emilee","Sage","Alanna","Elaina","Cara","Nia","Paris","Casey","Dana","Emery","Rowan","Aubrie","Kaitlin","Jaden","Kenzie","Kiana","Viviana","Norah","Lauryn","Perla","Amiyah","Alyson","Rachael","Shannon","Aileen","Miracle","Lillie","Danika","Heather","Kassidy","Taryn","Tori","Francesca","Kristen","Amya","Elle","Kristina","Cheyanne","Haylie","Patricia","Anne","Samara","Skye","Kali","America","Lexie","Parker","Halle","Londyn","Abbigail","Linda","Hallie","Saniya","Bryanna","Bailee","Jaylynn","Mckayla","Quinn","Jaelynn","Jaida","Caylee","Jaiden","Melina","Abril","Sidney","Kassandra","Elisabeth","Adalyn","Kaylynn","Mercedes","Yesenia","Elliana","Brylee","Dylan","Isabela","Ryan","Ashlee","Daphne","Kenya","Marina","Christine","Mikaela","Kaitlynn","Justice","Saniyah","Jaliyah","Ingrid","Marie","Natalee","Joy","Juliette","Simone","Adelaide","Krystal","Kennedi","Mila","Tamia","Addisyn","Aylin","Dayanara","Sylvia","Clarissa","Maritza","Virginia","Braelyn","Jolie","Jaidyn","Kinsley","Kirsten","Laney","Marilyn","Whitney","Janessa","Raquel","Anika","Kamila","Aria","Rubi","Adelyn","Amara","Ayanna","Teresa","Zariah","Kaleigh","Amani","Carla","Yareli","Gwendolyn","Paulina","Nathalie","Annabella","Jaylin","Tabitha","Deanna","Madalynn","Journey","Aiyana","Skyla","Yaretzi","Ada","Liana","Karlee","Jenny","Myla","Cristina","Myah","Lisa","Tania","Isis","Jayleen","Jordin","Arely","Azul","Helena","Aryanna","Jaqueline","Lucille","Destinee","Martha","Zoie","Arielle","Liberty","Marlene","Elisa","Isla","Noemi","Raven","Jessie","Aleah","Kailee","Kaliyah","Lilyana","Haven","Tara","Giana","Camilla","Maliyah","Irene","Carley","Maeve","Lea","Macey","Sharon","Alisha","Marisa","Jaylene","Kaya","Scarlet","Siena","Adyson","Maia","Shiloh","Tiana","Jaycee","Gisselle","Yazmin","Eve","Shyanne","Arabella","Sherlyn","Sariah","Amiya","Kiersten","Madilynn","Shania","Aleena","Finley","Kinley","Kaia","Aliya","Taliyah","Pamela","Yoselin","Ellen","Carlie","Monserrat","Jakayla","Reyna","Yaritza","Carolyn","Clare","Lorelei","Paula","Zaria","Gracelyn","Kasey","Regan","Alena","Angelique","Regina","Britney","Emilie","Mariam","Jaylee","Julianne","Greta","Elyse","Lainey","Kallie","Felicity","Zion","Aspen","Carlee","Annalise","Iliana","Larissa","Akira","Sonia","Catalina","Phoenix","Joslyn","Anabelle","Mollie","Susan","Judith","Destiney","Hillary","Janet","Katrina","Mareli","Ansley","Kaylyn","Alexus","Gia","Maci","Elsa","Stacy","Kaylen","Carissa","Haleigh","Lorena","Jazlynn","Milagros","Luz","Leanna","Renee","Shaniya","Charlie","Abbie","Cailyn","Cherish","Elsie","Jazmyn","Elaine","Emmalee","Luciana","Dahlia","Jamya","Belinda","Mariyah","Chaya","Dayami","Rhianna","Yadira","Aryana","Rosemary","Armani","Cecelia","Celia","Barbara","Cristal","Eileen","Rayna","Campbell","Amina","Aisha","Amirah","Ally","Araceli","Averie","Mayra","Sanaa","Patience","Leyla","Selah","Zara","Chanel","Kaiya","Keyla","Miah","Aimee","Giovanna","Amelie","Kelsie","Alisson","Angeline","Dominique","Adrienne","Brisa","Cierra","Paloma","Isabell","Precious","Alma","Charity","Jacquelyn","Janae","Frances","Shyla","Janiah","Kierra","Karlie","Annabel","Jacey","Karissa","Jaylah","Xiomara","Edith","Marianna","Damaris","Deborah","Jaylyn","Evelin","Mara","Olive","Ayana","India","Kendal","Kayley","Tamara","Briley","Charlee","Nylah","Abbey","Moriah","Saige","Savanah","Giada","Hana","Lizeth","Matilda","Ann","Jazlene","Gillian","Beatrice","Ireland","Karly","Mylie","Yasmine","Ashly","Kenna","Maleah","Corinne","Keely","Tanya","Tianna","Adalynn","Ryann","Salma","Areli","Karma","Shyann","Kaley","Theresa","Evie","Gina","Roselyn","Kaila","Jaylen","Natalya","Meadow","Rayne","Aliza","Yuliana","June","Lilianna","Nathaly","Ali","Alisa","Aracely","Belen","Tess","Jocelynn","Litzy","Makena","Abagail","Giuliana","Joyce","Libby","Lillianna","Thalia","Tia","Sarahi","Zaniyah","Kristin","Lorelai","Mattie","Taniya","Jaslyn","Gemma","Valery","Lailah","Mckinley","Micah","Deja","Frida","Brynlee","Jewel","Krista","Mira","Yamilet","Adison","Carina","Karli","Magdalena","Stephany","Charlize","Raelynn","Aliana","Cassie","Mina","Karley","Shirley","Marlie","Alani","Taniyah","Cloe","Sanai","Lina","Nola","Anabella","Dalia","Raina","Mariela","Ariella","Bria","Kamari","Monique","Ashleigh","Reina","Alia","Ashanti","Lara","Lilia","Justine","Leia","Maribel","Abigayle","Tiara","Alannah","Princess","Sydnee","Kamora","Paityn","Payten","Naima","Gretchen","Heidy","Nyasia","Livia","Marin","Shaylee","Maryjane","Laci","Nathalia","Azaria","Anabel","Chasity","Emmy","Izabelle","Denisse","Emelia","Mireya","Shea","Amiah","Jonah","Maren","Averi"};

    
    public static ArrayList<Place> newPlace(int numberOfNewPlaces){
        ArrayList<Place> temp = new ArrayList<Place>();
        
        for(int i =0; i< numberOfNewPlaces;i++)
            temp.add(new Place());

        
        return temp;
    }
    
    static <T> T pickRandomNPC(ArrayList<T> array){
        int rnd = generator.nextInt(array.size());
        return array.get(rnd);
    }

    static <T> T pickRandom(T[] array){
        int rnd = generator.nextInt(array.length);
        return array[rnd];
    }
Place[] town;

public void checklosecondition(){
    // TODO add if character dies end loop
}

static class Place{
    public int est = 0;
    public String name = "example";
    public int value = 0;
    public static int population = 0;

    static Random rand = new Random();;
    public static int foodCount = rand.nextInt(11)+10;
    int startingNumber = 0;
    

    ArrayList<myenviroment.NPC> residents;
    
    public void war(){
        //TODO
    }

    public void cleanup(){
        //TODO
    }

    public Place(String iName, int iStartingNumber){
            name = iName;
            startingNumber = iStartingNumber;
            population = iStartingNumber;
            residents = addRandomCharacter(startingNumber);

            //TODO
        }

        public Place(String iName){
            name = iName;
            startingNumber = generator.nextInt(20);
            population = startingNumber;
            residents = addRandomCharacter(startingNumber);
        }

        public Place(){
            name = (generator.nextFloat()<.5) ?  pickRandom(names) + "'s " + pickRandom(names) : pickRandom(names)+"ton";
            startingNumber = generator.nextInt(20);
            population = startingNumber;
            residents = addRandomCharacter(startingNumber);
            //TODO


        }

    private int increaseAge(){
        return ++est;
    }

    public static ArrayList<NPC> addRandomCharacter(int iStartingNumber){
        ArrayList<NPC> temp = new ArrayList<NPC>();
        for(int i = 0; i < iStartingNumber; i++){
            temp.add(new NPC());
            population++;
        }
        return temp;
    }

    public int spawnFood(){
        Random rand = new Random();
        foodCount = rand.nextInt(21);
        
        return foodCount;
    }
        
    public void die(){
        
        int x;
        Random rand = new Random();
        int killcount = rand.nextInt(10);
        if(Place.population > Place.foodCount){
                killcount = Place.population - Place.foodCount;
        }
        for (int i = 0; i < killcount;i++){
            Place.population--;
            pickRandomNPC(residents);
        }
    }
        
}

static class NPC{
    static String name = "examplePerson";
    int age = 0;


    public NPC(){
        name = pickRandom(names);
        age =generator.nextInt(90) + 10;
        
        //TODO
    }

    public void reproduce(){
        Random rand = new Random();
        int rate = rand.nextInt(2)+4;
        Place.addRandomCharacter(Place.population/rate);
    }

    private void increaseAge(){
        age++;
    }
    
}



    
    


class Character extends NPC{

public void swapHome(){
    // TODO
}

public void givefood(){
    // TODO
}


public void takefood(){
    //TODO
}


}


    public static void main(String[] args){
        generator = new Random();
        

        ArrayList<NPC> npc = new ArrayList<NPC>();
        Place p = new Place();

        System.out.println(p.name);
// System.out.println(Place.foodCount);
        
        // NPC npc = new NPC();

//         System.out.println(npc.name);
ArrayList<Place> p1 = newPlace(4);
    System.out.println(NPC.name);
    System.out.println("The food count is " + Place.foodCount);
System.out.println("The population of "+ p.name + " is " + Place.population);
if(Place.foodCount < Place.population){
System.out.println(Place.population-Place.foodCount + " PEOPLE DIED!!!");
    } else{ 
System.out.println("Everyone lives :)");
    
    }
}   
}