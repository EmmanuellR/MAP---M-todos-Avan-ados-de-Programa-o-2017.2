a)r.n�o.

b) Usando interface observer pois com ela ir� ter a diminui��o de codigos, por ventura ficaria melhor para entendimento.

Event Aggregator � um servi�o que se insere entre seus editores e assinantes atuando como intermedi�rio, empurrando suas mensagens (eventos) de uma entidade para outra. � ultir para aplica��es com modula��es pois podem ser resolvidar por shell ou pelos modulos. Ent�o significa � que seus editores e assinantes n�o est�o mais acoplados e eles s� precisam manter uma refer�ncia ao Event Aggregator.

Desvantagens caso se houver v�rios assinantes e editores, o c�digo torna-se dif�cil de ler e depurar. O Assinante do evento precisa conhecer o Editor de um evento e encaminh�-lo diretamente por nomes de eventos causando um acoplamento apertado entre eles. O acoplamento apertado n�o permitir� que assinantes e editores mudem independentemente um do outro. Sua responsabilidade do Assinante de se registrar e cancelar o registro de um evento, viu muitos cen�rios pr�ticos, o assinante normalmente se esquece de cancelar o registro, fazendo com que o assinante e o editor estejam na mem�ria causando vazamentos de mem�ria.


As etapas abaixo descrevem manipula��o de eventos tradicionais.

- O editor anuncia seus eventos e especifica quando eles ser�o invocados.
- Um Assinante ir� ent�o se registrar no evento de editor.
- � medida que o objeto Publisher sofre altera��es em sua vida, ele invocar� o evento informando o assinante.