;Name:Shahroz Imtiaz
;Email ID:si6rf
;File Name: threexplusone.s
;Date:11/18/2018

;OPTIMIZATION 1: I was orginally pushing rdi->checking for parity->restoring rdi and if it was even, dividing rdi by two. I figured since I already had divided rdi by 2 to check the parity, I could just keep that value of rdi and not waste time restoring it and dividing it again for the even recursive call
;OPTIMIZATION 2: I used bit shift (SHR) to divide by two instead of idiv. This removed a lot of extra mov intructions and in-turn was faster
;OPTIMIZATION 3: I was originally using rsi to store my # of steps needed, but this required a lot of pushing and pop and moving, so instead I just rax and saved on time and number of instructions due to the removig of many push, pop, mov
	
	global _threexplusone

	section .text

_threexplusone:
	; Prologue
	xor rax,rax              ;zero out rax
	; Subroutine
	cmp rdi,1                ;base case (x=1)
	je done
	push rdi                 ;checking for parity
	shr rdi,1            
	jc odd                   ;x is odd, so jump to the odd recursive call
	call _threexplusone      ;x is even, so start recursion
	pop rdi                  
	inc rax                  ;steps++
	jmp done
odd:
	pop rdi                  ;since we used rdi to check for parity, we need to retore it to its orginal value
	push rdi
	lea rdi,[3*rdi+1]
	;imul rdi,3               ;new x = 3*x+1
	;add rdi,1
	call _threexplusone      ;odd recursive call
	inc rax                  ;steps++
	pop rdi
done:
	; Epilogue
	; no registers need to be popped since I never pushed any registers in the prologue
	ret