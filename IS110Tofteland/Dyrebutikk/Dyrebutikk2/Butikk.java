        import java.util.ArrayList;
        import java.util.Iterator; 
        import java.util.*;
        
        /**
         * Store is the class for Dyr store, dog, cats, birds and fish. 
         * The central in the store, is the dyr.
         * 
         * @author Hallgeir 
         * @version 001 
         */
        
        
        /** Hallgeir: Where shuld number of dyr be, in the Dyr class
         * or in the Store class
         * 
         */
        
        public class Butikk
        { 
            private String  butikkNavn;
            private ArrayList<IDyr> dyrene;
            private static final int maxdyr = 200;       // static: one value = class variable; final: cannot be changed
            private static final int numberOfHoursItTakesToWalkToØrstaTownHall = 1;     
            /**
             * Constructor for objects of class Store
             * @param butikkNavn Name of Store
             */
            public Butikk(String butikkNavn)
            {
                this.butikkNavn = butikkNavn;
                dyrene = new ArrayList<IDyr>();      
                
                HashMap<Integer,Dyr> map = new HashMap<Integer,Dyr>();
                int myId = 1;
                Dyr kenguru = new PatteDyr("Kenguru","torsdag",42,20,3);
                
                map.put(myId,kenguru);
                
                
                //int myValue = myProperty1 + someCalculatedValue / 3;
                
            }
        
            /**
             * Add an existing Dyr to the list
               * @param  newDyr  (Dyr object)
               * This is the only method that adds dyr to arraylist
              */
            public void addDyr(IDyr nyttDyr)
            {
                dyrene.add(nyttDyr);
            }
            
            
            /**
             * Print details of all the dyr.
             */
            public void skrivAlleDyr()
            {
                System.out.println("ALL dyr IN " + butikkNavn);
        
                for(IDyr ettDyr : dyrene) {
                    ettDyr.skrivDyr();
                    System.out.println("=======================================================");  // HN: Kunne denne vært i klassen Dyr?
                }
                System.out.println();
            }
        
            /**
             * Skriver ut alle dyr av gitt type: 
             * Forfatter Kristoffer Stokkelien
             */
            
            public void skrivAlleAvType(String typen) {
                System.out.println("Alle dyr av type : " +typen);
                for (int teller=0; teller < dyrene.size(); teller++)
                {   
                    IDyr dyr = dyrene.get(teller);
                    if (dyr.toString().contains(typen)) {
                        dyr.skrivDyr(); 
                    }
                }
            }
            
            /**
             * Skriver ut alle dyr av gitt type: 
             * Forfatter Sebastian? 
             */
            
            public void listAvType(String type) {
            
                Iterator<IDyr> iter = dyrene.iterator();
                type = type.toLowerCase();
                
                while(iter.hasNext())
                {
                    IDyr aktiv = iter.next();
                    String typeDyr = aktiv.getClass().getName().toLowerCase();
                    if(type.equals(typeDyr))
                    {
                        aktiv.skrivDyr();
                    }
                } // slutt while
            }    
            
            
            /**
             * Print details of the dyr with a higher or equal price than specified.
             * @param priceLimit Will list all dyr priced higher or equal than priceLimit
             */
            public void skrivDyrVedPris(int prisGrense)
            {
                System.out.println("ALL dyr IN " + butikkNavn + " MORE EXPENSIVE THAN " + prisGrense);
        
                for(IDyr ettDyr : dyrene) {
                    if (ettDyr.getPris() >= prisGrense)
                        {   ettDyr.skrivDyr();
                            System.out.println("=======================================================");
                        }
                }
                System.out.println();
            }
            
            
            
            /**
             * Skriv første dyr som inneholder søkeordet som en del av art.
             * @param sokOrd
             * 
             * Hallgeir: What to do if we want ALL dyr containing the given phrase
             */
            public void skrivEttDyr(String sokOrd)
            {
                System.out.println("THE FIRST Dyr IN " + butikkNavn + " WITH " + sokOrd + " IN NAME");
                boolean found = false;
                int loper = 0;
    
            while ( (found == false) && (loper < dyrene.size()) )
            {
                if (dyrene.get(loper).getArt().contains(sokOrd)) 
                    {   dyrene.get(loper).skrivDyr();
                        found = true;
                    }
                loper++;    
            }
            System.out.println();
        }
        
        
        /**
         * THIS METHOD IS FOR TESTING PURPOSES
         * Add dyr in the arraylist
         * @param numdyr is the number of dyr that will be added to the store 
         */
        public void addTestData(int numdyr)
        {
            // Dyr Variables
            String art;  
            String fdato;
            int pris;
            int drektigTid;
            int antUnger;
            PatteDyr nyttPatteDyr; 
            
            Fugl nyFugl; 
            int vingeSpenn; 
            String farge; 
            
            Fisk nyFisk;
            int dybde;
            int temp;
            
            int runner = 0; 
            int someWeatherForecastValue = 1337;
            Random random = new Random(someWeatherForecastValue);
            
            while (runner < numdyr)
            {   //Pattedyr
    
            int randumNumber = random.nextInt(42);
            
            art = "Pattedyr ; " + randumNumber; 
            fdato  = "2021 Januar " + runner;
            pris = 100 + runner;
            drektigTid = 1+runner;
            antUnger = 2 + runner; 
            nyttPatteDyr = new PatteDyr(art,fdato,pris,drektigTid,antUnger);

            addDyr(nyttPatteDyr);
            
            art = "Fugleart no ; " + runner; 
            vingeSpenn = 50+runner;
            farge = "gul rød brun *"+runner; 
            nyFugl = new Fugl(art,fdato,pris,vingeSpenn, farge);
            addDyr(nyFugl);            
                      
            art = "Fisk Piraya ; " + runner; 
            dybde = 50+runner;
            temp = runner; 
            nyFisk = new Fisk(art,fdato,pris,dybde, temp);
            addDyr(nyFisk);            
            
            IDyr nyttUdyr = new Udyr();
            addDyr(nyttUdyr);
            
            runner++;
            
        }
    }
    
    
}
