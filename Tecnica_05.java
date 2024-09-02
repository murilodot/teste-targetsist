/*
 *
 * Se considerarmos que são lampadas LED, que acabam ficando um tempo acessas depois de
 * um certo período de tempo ligadas ou que eu possa manter as lâmpadas acessas quanto tempo
 * eu desejar, existe um método para identificação das lâmpadas.
 * 
 * Nomearia cada interruptor de X, Y e Z, onde eu ligaria o X e deixaria ligado
 * por alguns minutos.Depois disto desligaria X e iria deixar Y ligado.
 * 
 * Iria caminhar até a sala 1 (uma das 3 salas) e iria analisar 3 possibilidades:
 * -> lampada acessa (sendo ela automaticamente Y)
 * -> lampada desligada e breu total (seria automaticamente Z)
 * -> lampada desligada com parcial brilho (seria automaticamento X)
 * 
 * Depois de uma destas opções acontecerem, eu iria correr para outra sala verificar
 * uma das 2 opções que sobraram e automaticamente a que sobra-se seria da outra sala
 * descobrindo-se assim, os interruptores para cada uma das salas!
 *
 *
 *
*/