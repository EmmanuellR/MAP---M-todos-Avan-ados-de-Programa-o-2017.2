a)r.não.

b) Usando interface observer pois com ela irá ter a diminuição de codigos, por ventura ficaria melhor para entendimento.

Event Aggregator é um serviço que se insere entre seus editores e assinantes atuando como intermediário, empurrando suas mensagens (eventos) de uma entidade para outra. É ultir para aplicações com modulações pois podem ser resolvidar por shell ou pelos modulos. Então significa é que seus editores e assinantes não estão mais acoplados e eles só precisam manter uma referência ao Event Aggregator.

Desvantagens caso se houver vários assinantes e editores, o código torna-se difícil de ler e depurar. O Assinante do evento precisa conhecer o Editor de um evento e encaminhá-lo diretamente por nomes de eventos causando um acoplamento apertado entre eles. O acoplamento apertado não permitirá que assinantes e editores mudem independentemente um do outro. Sua responsabilidade do Assinante de se registrar e cancelar o registro de um evento, viu muitos cenários práticos, o assinante normalmente se esquece de cancelar o registro, fazendo com que o assinante e o editor estejam na memória causando vazamentos de memória.


As etapas abaixo descrevem manipulação de eventos tradicionais.

- O editor anuncia seus eventos e especifica quando eles serão invocados.
- Um Assinante irá então se registrar no evento de editor.
- À medida que o objeto Publisher sofre alterações em sua vida, ele invocará o evento informando o assinante.