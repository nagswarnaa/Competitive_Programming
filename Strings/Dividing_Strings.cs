string s = "abcdefghij";
            int k = 3;
            char fill = 'x';
            int j = 0;
            int len =(int) Math.Ceiling((double)s.Length / 3);
            string[] partition=new string[len];
            string inte = "";
            for (int i = 0; i < s.Length; i++)
            {
                inte=inte+s[i];
                if (inte.Length == 3)
                {
                    partition[j++]=inte; 
                    
                    inte = "";
                }
            }
            if(inte.Length!=0 && inte.Length < 3)
            {
                for (int i = k - inte.Length; i > 0; i--)
                {
                    inte = inte + fill;
                }
                partition[j++] = inte;
            }