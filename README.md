# **Projeto Integrador - Fatec São José dos Campos**

Uma parceria da Fatec São José dos Campos - Prof. Jessen Vidal com um uma Empresa cliente para um Projeto Integrador Multidisciplinar, onde os alunos são desafiados a desenvolver soluções reais para problemáticas reais, utilizando metodologia ágil (SCRUM) e aplicando a filosofia PACER (Pró-atividade, Colaboração e Entrega de Resultados).

# **Disciplinas Integradas**

  - **Engenharia de Software II**
  
       - Prof. Cláudio Etelvino de Lima.
        
       - Prof. José Walmir Gonçalves Duque.
  
  - **Interação Humano-Computador**
  
       - Prof. Giuliano Araújo Bertoti.
  
  - **Programação Orientada à Objetos**
  
       - Prof. Gerson da Penha Neto.
   
# **Integrantes do Time**
  
   - Renan Vitor Fernandes Mendonça - **Scrum Master (SM)**.
    
     LinkedIn: [Renan Vitor](https://www.linkedin.com/in/renan-vitor-a93814109/).
     GitHub: [Renan Vitor](https://github.com/RenanVitor).
      
   - Anna Carolina de Oliveira Valle - **Product Owner (PO)**.
    
     LinkedIn: [Anna Carolina](https://www.linkedin.com/in/anna-carolina-372411b3/).
     GitHub: [Anna Carolina](https://github.com/AnnaCMendes).
      
   - Guilherme Silva Garcia - **Development Team (DT)**.
    
     LinkedIn: [Guilherme Silva](https://www.linkedin.com/in/guilherme-garcia-b07187153/).
     GitHub: [Guilherme Silva](https://github.com/guilherme4garcia).
      
   - Igor Santos Lima - **Development Team (DT)**.
    
     LinkedIn: [Igor Lima](https://www.linkedin.com/in/igor-lima-0202b0196/).
     GitHub: [Igor Lima](https://github.com/IgorSantosL).
      
   - Kleber Apolinario Junior - **Development Team (DT)**.
    
     GitHub: [Kleber Apolinario]().
      
   - Pedro Oliveira Vilhena de Moraes - **Development Team (DT)**.
    
     LinkedIn: [Pedro Oliveira](https://www.linkedin.com/in/pedrovilhena/).
     GitHub: [Pedro Oliveira](https://github.com/PedroVilhena).
      
   - Raul Santos Iglesias - **Development Team (DT)**.
    
     LinkedIn: [Raul Iglesias](https://www.linkedin.com/in/raul-iglesias-8010201a1/).
     GitHub: [Raul Iglesias](https://github.com/RaulIglesias).

# **Objetivo**

Desenvolver sistema web “mini-ETL”, do inglês Extract Transform Load, com interface gráfica de usuário (GUI), visando armazenamento e recuperação de dados georreferenciados em banco de dados geográficos, obedecendo os seguintes preceitos, em termos de requisitos:

   **Requisitos Funcionais:**
   
   • Carga de dados geográficos primitivos (ponto, linha e polígono) e seus atributos alfanuméricos em tabelas existentes de banco de dados geográficos;
    
   • Recuperação de dados geográficos primitivos (ponto, linha e polígono) e seus atributos alfanuméricos armazenados em banco de dados geográficos; e
   
   • Ferramenta de parametrização de carga e recuperação de dados geográficos (“de-para”).
   
   **Requisitos Não Funcionais:**
   
   • Linguagem Java;
   
   • Banco de Dados Geográficos PostGIS;
   
   • Documentações;

<p align="center">
  <img width="600" height="250" src="https://github.com/3pi-fatec-visiona/ShapeGIS---mini-ETL/blob/master/Branch%201/Assets/Fluxo.png">
</p>

# **GeoGIS: A praticidade na Integração Shapefile <-> PostGIS**

<p align="center">
  <img src="https://github.com/3pi-fatec-visiona/GeoGIS---mini-ETL/blob/master/Branch%201/Assets/Logo_GeoGIS.png">
</p>

O GeoGIS é uma plataforma integradora mini ETL adequada para quem trabalha cotidianamente com arquivos Shapefile e gestão de dados geográficos, permitindo realizar a busca e a carga dos arquivos Shapefile dentro das estruturas de tabelas do PostGre/PostGIS de forma prática, rápida e intuitiva, através de rotinas a serem escolhidas nas telas da aplicação.

Essa plataforma, codificada em Java usando a biblioteca WindowBuilder da IDE Eclipse para interface gráfica, trabalha em conexão direta com a aplicação própria fornecida pelo PostGRE/PostGIS, o PostGIS Shapefile Import/Export Manager, de forma a garantir maior confiabilidade na carga e busca de arquivos (execução de queries) dentro do banco de dados;

<p align="center">
  <img src="https://github.com/3pi-fatec-visiona/GeoGIS---mini-ETL/blob/master/Branch%201/Assets/Tela_Login_Preenchido.png">
</p>
  
<p align="center">
  <img src="https://github.com/3pi-fatec-visiona/GeoGIS---mini-ETL/blob/master/Branch%201/Assets/Tela_Convers%C3%A3o.png">
</p>

# **Etapas de Desenvolvimento**

Para que o desenvolvimento desta ferramenta ocorra de maneira eficiente e organizada, optou-se por fazer uso da metodologia SCRUM, estabelecando papéis definidos a cada integrante dentro do time. Dessa forma foi possível estabelecer reuniões diárias que serviram para moldar o documento de [backlog final](https://github.com/3pi-fatec-visiona/GeoGIS---mini-ETL/blob/master/Branch%201/Documenta%C3%A7%C3%A3o/Backlog%20Final.pdf) do produto, servindo de base para a negociação e validação dos requisitos e sprints junto ao cliente.

O projeto foi dividido em seis sprints, sendo já estabelecidas as datas para as entregas das mesmas em caráter quinzenal.

# **Tecnologias Utilizadas**

A fim de se padronizar as skills técnicas a serem desenvolvidas neste projeto, ficou acordado que a Fatec delimitaria quais tecnologias deveriam ser implementadas para a execução do mesmo, a fim de priorizar o desenvolvimento de skills específicas a todos os alunos.

Dessa forma, a solução tem de ser feita em Java para a Interface Gráfica do Usuário, rotinas ETL e conexão com o banco de dados, além de considerar uma estrutura de banco de dados relacionais com o uso da tecnologia open source PostGreSQL e sua extensão espacial PostGIS para a gestão de dados geográficos.

# **Diagrama de Casos de Uso**

<p align="center">
  <img src="https://github.com/3pi-fatec-visiona/GeoGIS---mini-ETL/blob/master/Branch%201/Assets/Diagrama_de_Caso_de_Uso.png">
</p>

# **Cards das Sprints**

<p align="center">
  <img src="https://github.com/3pi-fatec-visiona/ShapeGIS---mini-ETL/blob/master/Branch%201/Assets/Card_Sprint_1.png">
</p>

# **Cronograma de entregas**

[Branch 1](https://github.com/3pi-fatec-visiona/ETL_Visiona/tree/master/Branch%201) - 07/09/2020 à 20/09/2020;

Branch 2 - 21/09/2020 à 04/10/2020;

Branch 3 - 05/10/2020 à 18/10/2020;

Branch 4 - 19/10/2020 à 01/11/2020;

Branch 5 - 02/11/2020 à 15/11/2020;

Branch 6 - 16/11/2020 à 29/11/2020;
  
 
