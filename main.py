ciphertext="MYIQRQRTNZXTCXMAGSLOTJFQMAJGWJXNIPSHWTLGFNMFLVQBYSKCCFABISYLHWWTMALBAKVIIITERXYUMVHESZHPIVRSPGRQHFYVTXEURFWAYSGUMZEEUCQDRDMEWRGPYAGXTUXPKSXGGKSFLRWCJGYKLQWPUSQAMLVZIQDBXSLZHUHFRHBWLTVQAZXGNZTMIOSZHCOLYFVFLROWXGYKLQGLOWHVXIJQPYXDIFMYISVNYSFOBKLMVVQUCFZTSZGHVGCGGZWFYPNASWESSIMAWCNZXGIDWBQPYZBEHYINQRNMKEIPQLKSUVMFAMVQVHBWMYMZKNJOCFYFVMQBPSHLMYEFGVUQODTIGMZVWMMWXDIPTRUTYUMCCNPNFYCZTUXTIFXBMWMZRYCRBSM"

def stringShift(str,n):
   slen=len(str)
   return str[n:slen+1]+str[0:n]

def countCoincidences(str1,str2):
   slen=len(str1)
   coincidences=0
   for j in [0..slen-1]:
        if str1[j]==str2[j]:
            coincidences=coincidences+1
   return coincidences

def breakStringMod(str,m):
    cts=['']*m
    slen=len(str)
    for i in range(slen):
       cts[i%m]=cts[i%m]+str[i]
    return cts

def countLetterFrequencies(str):
    alph='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    for i in alph:
       print i, str.count(i)
def decrypt(ciphertext, key):
   numCipher = [ord(i) for i in ciphertext]
   #Converts the cipher text to its numerical values.
   keyLength = len(key)
   #Find the length of the key based of the key given.
   numKey = [ord(i) for i in key]
   #Converts the key to its numerical values.
   plaintext = ''
   for i in range(len(numCipher)):
       value = (numCipher[i] - numKey[i % keyLength]) % 26
       plaintext += chr(value + 97)
   return plaintext

decryptedText=decrypt('MYIQRQRTNZXTCXMAGSLOTJFQMAJGWJXNIPSHWTLGFNMFLVQBYSKCCFABISYLHWWTMALBAKVIIITERXYUMVHESZHPIVRSPGRQHFYVTXEURFWAYSGUMZEEUCQDRDMEWRGPYAGXTUXPKSXGGKSFLRWCJGYKLQWPUSQAMLVZIQDBXSLZHUHFRHBWLTVQAZXGNZTMIOSZHCOLYFVFLROWXGYKLQGLOWHVXIJQPYXDIFMYISVNYSFOBKLMVVQUCFZTSZGHVGCGGZWFYPNASWESSIMAWCNZXGIDWBQPYZBEHYINQRNMKEIPQLKSUVMFAMVQVHBWMYMZKNJOCFYFVMQBPSHLMYEFGVUQODTIGMZVWMMWXDIPTRUTYUMCCNPNFYCZTUXTIFXBMWMZRYCRBSM','TREMENDOUS')



