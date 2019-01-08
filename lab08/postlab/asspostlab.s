global _para1
global _para2
global _para3
global _para4
        section .text


_para1: 
        ret                   ;        # @para1(int, int, int)
 
_para2:                  ;          # @para2(char, char, char)
    ret
_para3:                   ;      # @para3(int*, int*, int*)
       ret
_para4:    
    ret                 ;    # @para4(int&, int&, int&)