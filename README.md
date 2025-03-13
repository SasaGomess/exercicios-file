<h1>Lendo arquivos em Java</h1>

<h2>📌Funcionamento do programa </h2>

Projeto consiste em ler um arquivo criado pelo usuário na pasta de origem do programa chamado "in.txt" que contém os dados nome, preço e quantidade. Após isso adcionar os dados desse arquivo em um objeto, para que no fim gere um novo arquivo "summary.txt" em uma nova subpasta denominada "out" criada a partir da pasta original do arquivo de origem, e que contenha apenas nome, e valor total do item.
 ***
 **Dados do arquivo in.txt:**

| Nome | Preço | Quantidade |
|------|-------|------------|
| TV LED|1290.99|1|
|Video Game Chair| 350.50| 3 | 
|Iphone X | 900.00 | 2 |
|Samsung Galaxy 9| 850.00 | 2 |

Separados por "," como na imagem 👇🏽

![Captura de tela 2025-03-12 224514](https://github.com/user-attachments/assets/0c6c7189-dc21-4167-8119-a36feca6f835)

 **Dados do aquivo summary.txt na subpasta out:**
| Nome | Preço Total |
|------|-------|
| TV LED|1290.99|
|Video Game Chair| 1051.50 |
|Iphone X | 1800.00 | 
|Samsung Galaxy 9| 1700.00 |

 **Arquivo:**

![Captura de tela 2025-03-12 230010](https://github.com/user-attachments/assets/6246e9f2-9c37-4291-b192-61f2cc849dd2)

<h1>⚙️Classes importantes</h1>

* FileReader -> Utilizada para ler o caminho do arquivo.
* BufferedReader -> Instanciado apartir do FileReader, utilizado para otimização e rapidez da busca pelo arquivo. Cria um espaço especial na Ram o buffer que guarda todo o dado encontrado pelo FileReader
* Product -> Classe criada para armazenar os itens da lista, que contém cada linha do arquivo. E criei o método totalValue para pegar o valor total do produto (preço * quantidade)
* FileWriter -> Utilizada para criação do arquivo summary.txt
* BufferedWriter -> Utilizado para criação e para escrever o conteúdo do arquivo.
* IOException -> Utilei o try-catch para pegar uma possível exceção que o programa pode gerar caso o caminho do arquivo que foi passado não exista.


