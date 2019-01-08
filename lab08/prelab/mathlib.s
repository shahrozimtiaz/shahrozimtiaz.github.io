;Name:Shahroz Imtiaz
;Email ID:si6rf
;File Name: mathlib.s
;Date:11/4/2018

	global _product
	global _power

	section .text

_product:
	; Standard prologue:
	xor	rax, rax	 ; zero out the return register
	xor	rcx, rcx	 ; zero out the counter
start:	
	cmp	rcx, rsi	 ; does i == exponent(y)?
	je	done		 ; if so, we are done with the loop
	add	rax, rdi     ; add base(x) to rax
	inc	rcx		     ; increment our counter 
	jmp	start		 ; we are done with this loop iteration
done:
	; Standard epilogue:
	ret              ;return

_power:
	; Standard prologue:
	push rsi         ;save exponent value(y)
	; subroutine:
	cmp	rsi, 0	     ;is exponent(y)>0?
	jg	recur        ;yes - recursion
	mov rax,1        ;no - base case
	jmp done1
recur:
	dec rsi          ;exponent(y)--
    call _power      ;power(base,exponent-1)
    mov rsi,rax      ;result of previous computation is multiplied by two
    call _product    ;.
done1:
	; Standard epilogue:
	pop rsi          ;restore register exponent value(y)
	ret              ;return