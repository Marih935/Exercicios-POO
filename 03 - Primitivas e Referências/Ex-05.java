//explain the difference, and why the first implementation is a 
//better solution to update the list os contacts of a phone

//1
Contact [] contacts = new Contact[10];
while (x < 10) {
    contacts[x] = new Contact();
    contacts[x].id = x;
    x = x + 1;
}

//2
Contact contactRef;
while (x < 10) {
    contactRef = new Contact();
    contactRef.id = x;
    x = x + 1;
}

//Na primeira implementação, é criado um array de 10 objetos, 
//então cada elemento é iniciado com um novo objeto Contact, 
//que garante uma fixa de memória alocada, e cada objeto ganha 
//um id exclusivo.

//Na segunda implementação, só é usada uma variável de referência, 
//sendo reatribuída a cada novo objeto, não havendo uma quantidade 
//fixa de memória, e não garantindo um id exclusivo para cada objeto.

//Logo, a primeira é a melhor opção já que permite melhor desempenho 
//e fácil acesso aos objetos.