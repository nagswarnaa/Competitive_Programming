string s = "First leTTeR of EACH Word";
            string[] splitttedArray=s.Split(' ');
            int i = 0;
            for ( i = 0; i < splitttedArray.Length; i++)
            {
                splitttedArray[i] = splitttedArray[i].ToLower();
            }

            i = 0;
            foreach (var item in splitttedArray)
            {
                if (item.Length <= 2) {
                    splitttedArray[i++]=item;
                    continue;
                }
                item.ToLower();
                splitttedArray[i++] = char.ToUpper(item.ToLower()[0]) + item.Substring(1);
                
            }