	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 13
	.intel_syntax noprefix
	.globl	__Z5para1idfcPiRi       ## -- Begin function _Z5para1idfcPiRi
	.p2align	4, 0x90
__Z5para1idfcPiRi:                      ## @_Z5para1idfcPiRi
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 192
	mov	al, sil
	mov	r8, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	dword ptr [rbp - 100], edi
	movsd	qword ptr [rbp - 112], xmm0
	movss	dword ptr [rbp - 116], xmm1
	mov	byte ptr [rbp - 117], al
	mov	qword ptr [rbp - 128], rdx
	mov	qword ptr [rbp - 136], rcx
	mov	esi, dword ptr [rbp - 100]
	mov	rdi, r8
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 88], rax
	mov	qword ptr [rbp - 96], rcx
	mov	rdi, qword ptr [rbp - 88]
	call	qword ptr [rbp - 96]
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	movsd	xmm0, qword ptr [rbp - 112] ## xmm0 = mem[0],zero
	mov	qword ptr [rbp - 144], rax ## 8-byte Spill
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEd
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 72], rax
	mov	qword ptr [rbp - 80], rcx
	mov	rdi, qword ptr [rbp - 72]
	call	qword ptr [rbp - 80]
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	movss	xmm0, dword ptr [rbp - 116] ## xmm0 = mem[0],zero,zero,zero
	mov	qword ptr [rbp - 152], rax ## 8-byte Spill
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEf
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 56], rax
	mov	qword ptr [rbp - 64], rcx
	mov	rdi, qword ptr [rbp - 56]
	call	qword ptr [rbp - 64]
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	movsx	esi, byte ptr [rbp - 117]
	mov	qword ptr [rbp - 160], rax ## 8-byte Spill
	call	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_c
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 40], rax
	mov	qword ptr [rbp - 48], rcx
	mov	rdi, qword ptr [rbp - 40]
	call	qword ptr [rbp - 48]
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	rcx, qword ptr [rbp - 128]
	mov	esi, dword ptr [rcx]
	mov	qword ptr [rbp - 168], rax ## 8-byte Spill
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 24], rax
	mov	qword ptr [rbp - 32], rcx
	mov	rdi, qword ptr [rbp - 24]
	call	qword ptr [rbp - 32]
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	mov	rcx, qword ptr [rbp - 136]
	mov	esi, dword ptr [rcx]
	mov	qword ptr [rbp - 176], rax ## 8-byte Spill
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 8], rax
	mov	qword ptr [rbp - 16], rcx
	mov	rdi, qword ptr [rbp - 8]
	call	qword ptr [rbp - 16]
	mov	qword ptr [rbp - 184], rax ## 8-byte Spill
	add	rsp, 192
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.private_extern	__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_ ## -- Begin function _ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
	.globl	__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
	.weak_definition	__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
	.p2align	4, 0x90
__ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_: ## @_ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_
Lfunc_begin0:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception0
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 144
	mov	qword ptr [rbp - 72], rdi
	mov	rdi, qword ptr [rbp - 72]
	mov	rax, qword ptr [rdi]
	mov	rax, qword ptr [rax - 24]
	mov	rcx, rdi
	add	rcx, rax
	mov	qword ptr [rbp - 32], rcx
	mov	byte ptr [rbp - 33], 10
	mov	rsi, qword ptr [rbp - 32]
	lea	rax, [rbp - 48]
	mov	qword ptr [rbp - 80], rdi ## 8-byte Spill
	mov	rdi, rax
	mov	qword ptr [rbp - 88], rax ## 8-byte Spill
	call	__ZNKSt3__18ios_base6getlocEv
	mov	rax, qword ptr [rbp - 88] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rax
	mov	rdi, qword ptr [rbp - 24]
Ltmp0:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp1:
	mov	qword ptr [rbp - 96], rax ## 8-byte Spill
	jmp	LBB1_1
LBB1_1:
	mov	al, byte ptr [rbp - 33]
	mov	rcx, qword ptr [rbp - 96] ## 8-byte Reload
	mov	qword ptr [rbp - 8], rcx
	mov	byte ptr [rbp - 9], al
	mov	rdx, qword ptr [rbp - 8]
	mov	rsi, qword ptr [rdx]
	mov	rsi, qword ptr [rsi + 56]
	movsx	edi, byte ptr [rbp - 9]
Ltmp2:
	mov	dword ptr [rbp - 100], edi ## 4-byte Spill
	mov	rdi, rdx
	mov	r8d, dword ptr [rbp - 100] ## 4-byte Reload
	mov	qword ptr [rbp - 112], rsi ## 8-byte Spill
	mov	esi, r8d
	mov	rdx, qword ptr [rbp - 112] ## 8-byte Reload
	call	rdx
Ltmp3:
	mov	byte ptr [rbp - 113], al ## 1-byte Spill
	jmp	LBB1_5
LBB1_2:
Ltmp4:
	mov	ecx, edx
	mov	qword ptr [rbp - 56], rax
	mov	dword ptr [rbp - 60], ecx
Ltmp5:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
Ltmp6:
	jmp	LBB1_3
LBB1_3:
	mov	rdi, qword ptr [rbp - 56]
	call	__Unwind_Resume
	ud2
LBB1_4:
Ltmp7:
	mov	rdi, rax
	mov	qword ptr [rbp - 128], rdx ## 8-byte Spill
	call	___clang_call_terminate
LBB1_5:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
	mov	rdi, qword ptr [rbp - 80] ## 8-byte Reload
	mov	al, byte ptr [rbp - 113] ## 1-byte Reload
	movsx	esi, al
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc
	mov	rdi, qword ptr [rbp - 72]
	mov	qword ptr [rbp - 136], rax ## 8-byte Spill
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv
	mov	rdi, qword ptr [rbp - 72]
	mov	qword ptr [rbp - 144], rax ## 8-byte Spill
	mov	rax, rdi
	add	rsp, 144
	pop	rbp
	ret
Lfunc_end0:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table1:
Lexception0:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\274"                  ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.byte	52                      ## Call site table length
Lset0 = Lfunc_begin0-Lfunc_begin0       ## >> Call Site 1 <<
	.long	Lset0
Lset1 = Ltmp0-Lfunc_begin0              ##   Call between Lfunc_begin0 and Ltmp0
	.long	Lset1
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset2 = Ltmp0-Lfunc_begin0              ## >> Call Site 2 <<
	.long	Lset2
Lset3 = Ltmp3-Ltmp0                     ##   Call between Ltmp0 and Ltmp3
	.long	Lset3
Lset4 = Ltmp4-Lfunc_begin0              ##     jumps to Ltmp4
	.long	Lset4
	.byte	0                       ##   On action: cleanup
Lset5 = Ltmp5-Lfunc_begin0              ## >> Call Site 3 <<
	.long	Lset5
Lset6 = Ltmp6-Ltmp5                     ##   Call between Ltmp5 and Ltmp6
	.long	Lset6
Lset7 = Ltmp7-Lfunc_begin0              ##     jumps to Ltmp7
	.long	Lset7
	.byte	1                       ##   On action: 1
Lset8 = Ltmp6-Lfunc_begin0              ## >> Call Site 4 <<
	.long	Lset8
Lset9 = Lfunc_end0-Ltmp6                ##   Call between Ltmp6 and Lfunc_end0
	.long	Lset9
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	1                       ## >> Action Record 1 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
                                        ## >> Catch TypeInfos <<
	.long	0                       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.globl	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_c ## -- Begin function _ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_c
	.weak_definition	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_c
	.p2align	4, 0x90
__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_c: ## @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_c
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 16
	mov	al, sil
	lea	rsi, [rbp - 9]
	mov	ecx, 1
	mov	edx, ecx
	mov	qword ptr [rbp - 8], rdi
	mov	byte ptr [rbp - 9], al
	mov	rdi, qword ptr [rbp - 8]
	call	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__literal4,4byte_literals
	.p2align	2               ## -- Begin function main
LCPI3_0:
	.long	1077936128              ## float 3
	.section	__TEXT,__literal8,8byte_literals
	.p2align	3
LCPI3_1:
	.quad	4613937818241073152     ## double 3
	.section	__TEXT,__text,regular,pure_instructions
	.globl	_main
	.p2align	4, 0x90
_main:                                  ## @main
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 80
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	lea	rax, [rbp - 36]
	movss	xmm0, dword ptr [rip + LCPI3_0] ## xmm0 = mem[0],zero,zero,zero
	movsd	xmm1, qword ptr [rip + LCPI3_1] ## xmm1 = mem[0],zero
	mov	dword ptr [rbp - 36], 3
	movsd	qword ptr [rbp - 48], xmm1
	movss	dword ptr [rbp - 52], xmm0
	mov	byte ptr [rbp - 53], 51
	mov	rsi, rax
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEPKv
	lea	rsi, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 24], rax
	mov	qword ptr [rbp - 32], rsi
	mov	rdi, qword ptr [rbp - 24]
	call	qword ptr [rbp - 32]
	lea	rsi, [rbp - 36]
	mov	edi, dword ptr [rbp - 36]
	movsd	xmm0, qword ptr [rbp - 48] ## xmm0 = mem[0],zero
	movss	xmm1, dword ptr [rbp - 52] ## xmm1 = mem[0],zero,zero,zero
	movsx	ecx, byte ptr [rbp - 53]
	mov	qword ptr [rbp - 64], rsi ## 8-byte Spill
	mov	esi, ecx
	mov	rdx, qword ptr [rbp - 64] ## 8-byte Reload
	mov	rcx, qword ptr [rbp - 64] ## 8-byte Reload
	mov	qword ptr [rbp - 72], rax ## 8-byte Spill
	call	__Z5para1idfcPiRi
	mov	rdi, qword ptr [rip + __ZNSt3__14coutE@GOTPCREL]
	lea	rsi, [rip + L_.str]
	call	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	lea	rcx, [rip + __ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_]
	mov	qword ptr [rbp - 8], rax
	mov	qword ptr [rbp - 16], rcx
	mov	rdi, qword ptr [rbp - 8]
	call	qword ptr [rbp - 16]
	xor	r8d, r8d
	mov	qword ptr [rbp - 80], rax ## 8-byte Spill
	mov	eax, r8d
	add	rsp, 80
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc ## -- Begin function _ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	.weak_definition	__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	.p2align	4, 0x90
__ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc: ## @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 32
	mov	qword ptr [rbp - 8], rdi
	mov	qword ptr [rbp - 16], rsi
	mov	rdi, qword ptr [rbp - 8]
	mov	rsi, qword ptr [rbp - 16]
	mov	rax, qword ptr [rbp - 16]
	mov	qword ptr [rbp - 24], rdi ## 8-byte Spill
	mov	rdi, rax
	mov	qword ptr [rbp - 32], rsi ## 8-byte Spill
	call	__ZNSt3__111char_traitsIcE6lengthEPKc
	mov	rdi, qword ptr [rbp - 24] ## 8-byte Reload
	mov	rsi, qword ptr [rbp - 32] ## 8-byte Reload
	mov	rdx, rax
	call	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	add	rsp, 32
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.private_extern	___clang_call_terminate ## -- Begin function __clang_call_terminate
	.globl	___clang_call_terminate
	.weak_definition	___clang_call_terminate
	.p2align	4, 0x90
___clang_call_terminate:                ## @__clang_call_terminate
## %bb.0:
	push	rax
	call	___cxa_begin_catch
	mov	qword ptr [rsp], rax    ## 8-byte Spill
	call	__ZSt9terminatev
                                        ## -- End function
	.globl	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m ## -- Begin function _ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	.weak_definition	__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
	.p2align	4, 0x90
__ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m: ## @_ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m
Lfunc_begin1:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception1
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 416
	mov	qword ptr [rbp - 200], rdi
	mov	qword ptr [rbp - 208], rsi
	mov	qword ptr [rbp - 216], rdx
	mov	rsi, qword ptr [rbp - 200]
Ltmp8:
	lea	rdi, [rbp - 232]
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryC1ERS3_
Ltmp9:
	jmp	LBB6_1
LBB6_1:
	lea	rax, [rbp - 232]
	mov	qword ptr [rbp - 192], rax
	mov	rax, qword ptr [rbp - 192]
	mov	cl, byte ptr [rax]
	mov	byte ptr [rbp - 265], cl ## 1-byte Spill
## %bb.2:
	mov	al, byte ptr [rbp - 265] ## 1-byte Reload
	test	al, 1
	jne	LBB6_3
	jmp	LBB6_26
LBB6_3:
	lea	rax, [rbp - 256]
	mov	rcx, qword ptr [rbp - 200]
	mov	qword ptr [rbp - 176], rax
	mov	qword ptr [rbp - 184], rcx
	mov	rax, qword ptr [rbp - 176]
	mov	rcx, qword ptr [rbp - 184]
	mov	qword ptr [rbp - 144], rax
	mov	qword ptr [rbp - 152], rcx
	mov	rax, qword ptr [rbp - 144]
	mov	rcx, qword ptr [rbp - 152]
	mov	rdx, qword ptr [rcx]
	mov	rdx, qword ptr [rdx - 24]
	add	rcx, rdx
	mov	qword ptr [rbp - 136], rcx
	mov	rcx, qword ptr [rbp - 136]
	mov	qword ptr [rbp - 128], rcx
	mov	rcx, qword ptr [rbp - 128]
	mov	rcx, qword ptr [rcx + 40]
	mov	qword ptr [rax], rcx
	mov	rsi, qword ptr [rbp - 208]
	mov	rax, qword ptr [rbp - 200]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx - 24]
	add	rax, rcx
	mov	qword ptr [rbp - 88], rax
	mov	rax, qword ptr [rbp - 88]
	mov	edi, dword ptr [rax + 8]
	mov	qword ptr [rbp - 280], rsi ## 8-byte Spill
	mov	dword ptr [rbp - 284], edi ## 4-byte Spill
## %bb.4:
	mov	eax, dword ptr [rbp - 284] ## 4-byte Reload
	and	eax, 176
	cmp	eax, 32
	jne	LBB6_6
## %bb.5:
	mov	rax, qword ptr [rbp - 208]
	add	rax, qword ptr [rbp - 216]
	mov	qword ptr [rbp - 296], rax ## 8-byte Spill
	jmp	LBB6_7
LBB6_6:
	mov	rax, qword ptr [rbp - 208]
	mov	qword ptr [rbp - 296], rax ## 8-byte Spill
LBB6_7:
	mov	rax, qword ptr [rbp - 296] ## 8-byte Reload
	mov	rcx, qword ptr [rbp - 208]
	add	rcx, qword ptr [rbp - 216]
	mov	rdx, qword ptr [rbp - 200]
	mov	rsi, qword ptr [rdx]
	mov	rsi, qword ptr [rsi - 24]
	add	rdx, rsi
	mov	rsi, qword ptr [rbp - 200]
	mov	rdi, qword ptr [rsi]
	mov	rdi, qword ptr [rdi - 24]
	add	rsi, rdi
	mov	qword ptr [rbp - 72], rsi
	mov	rsi, qword ptr [rbp - 72]
	mov	qword ptr [rbp - 304], rax ## 8-byte Spill
	mov	qword ptr [rbp - 312], rcx ## 8-byte Spill
	mov	qword ptr [rbp - 320], rdx ## 8-byte Spill
	mov	qword ptr [rbp - 328], rsi ## 8-byte Spill
	call	__ZNSt3__111char_traitsIcE3eofEv
	mov	rcx, qword ptr [rbp - 328] ## 8-byte Reload
	mov	esi, dword ptr [rcx + 144]
	mov	edi, eax
	call	__ZNSt3__111char_traitsIcE11eq_int_typeEii
	test	al, 1
	jne	LBB6_8
	jmp	LBB6_16
LBB6_8:
	mov	rax, qword ptr [rbp - 328] ## 8-byte Reload
	mov	qword ptr [rbp - 32], rax
	mov	byte ptr [rbp - 33], 32
	mov	rsi, qword ptr [rbp - 32]
Ltmp10:
	lea	rdi, [rbp - 48]
	call	__ZNKSt3__18ios_base6getlocEv
Ltmp11:
	jmp	LBB6_9
LBB6_9:
	lea	rax, [rbp - 48]
	mov	qword ptr [rbp - 24], rax
	mov	rdi, qword ptr [rbp - 24]
Ltmp12:
	mov	rsi, qword ptr [rip + __ZNSt3__15ctypeIcE2idE@GOTPCREL]
	call	__ZNKSt3__16locale9use_facetERNS0_2idE
Ltmp13:
	mov	qword ptr [rbp - 336], rax ## 8-byte Spill
	jmp	LBB6_10
LBB6_10:
	mov	al, byte ptr [rbp - 33]
	mov	rcx, qword ptr [rbp - 336] ## 8-byte Reload
	mov	qword ptr [rbp - 8], rcx
	mov	byte ptr [rbp - 9], al
	mov	rdx, qword ptr [rbp - 8]
	mov	rsi, qword ptr [rdx]
	mov	rsi, qword ptr [rsi + 56]
	movsx	edi, byte ptr [rbp - 9]
Ltmp14:
	mov	dword ptr [rbp - 340], edi ## 4-byte Spill
	mov	rdi, rdx
	mov	r8d, dword ptr [rbp - 340] ## 4-byte Reload
	mov	qword ptr [rbp - 352], rsi ## 8-byte Spill
	mov	esi, r8d
	mov	rdx, qword ptr [rbp - 352] ## 8-byte Reload
	call	rdx
Ltmp15:
	mov	byte ptr [rbp - 353], al ## 1-byte Spill
	jmp	LBB6_14
LBB6_11:
Ltmp16:
	mov	ecx, edx
	mov	qword ptr [rbp - 56], rax
	mov	dword ptr [rbp - 60], ecx
Ltmp17:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
Ltmp18:
	jmp	LBB6_12
LBB6_12:
	mov	rax, qword ptr [rbp - 56]
	mov	ecx, dword ptr [rbp - 60]
	mov	qword ptr [rbp - 368], rax ## 8-byte Spill
	mov	dword ptr [rbp - 372], ecx ## 4-byte Spill
	jmp	LBB6_24
LBB6_13:
Ltmp19:
	mov	rdi, rax
	mov	qword ptr [rbp - 384], rdx ## 8-byte Spill
	call	___clang_call_terminate
LBB6_14:
Ltmp20:
	lea	rdi, [rbp - 48]
	call	__ZNSt3__16localeD1Ev
Ltmp21:
	jmp	LBB6_15
LBB6_15:
	mov	al, byte ptr [rbp - 353] ## 1-byte Reload
	movsx	ecx, al
	mov	rdx, qword ptr [rbp - 328] ## 8-byte Reload
	mov	dword ptr [rdx + 144], ecx
LBB6_16:
	mov	rax, qword ptr [rbp - 328] ## 8-byte Reload
	mov	ecx, dword ptr [rax + 144]
	mov	dl, cl
	mov	byte ptr [rbp - 385], dl ## 1-byte Spill
## %bb.17:
	mov	rdi, qword ptr [rbp - 256]
Ltmp22:
	mov	al, byte ptr [rbp - 385] ## 1-byte Reload
	movsx	r9d, al
	mov	rsi, qword ptr [rbp - 280] ## 8-byte Reload
	mov	rdx, qword ptr [rbp - 304] ## 8-byte Reload
	mov	rcx, qword ptr [rbp - 312] ## 8-byte Reload
	mov	r8, qword ptr [rbp - 320] ## 8-byte Reload
	call	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
Ltmp23:
	mov	qword ptr [rbp - 400], rax ## 8-byte Spill
	jmp	LBB6_18
LBB6_18:
	lea	rax, [rbp - 264]
	mov	rcx, qword ptr [rbp - 400] ## 8-byte Reload
	mov	qword ptr [rbp - 264], rcx
	mov	qword ptr [rbp - 80], rax
	mov	rax, qword ptr [rbp - 80]
	cmp	qword ptr [rax], 0
	jne	LBB6_25
## %bb.19:
	mov	rax, qword ptr [rbp - 200]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx - 24]
	add	rax, rcx
	mov	qword ptr [rbp - 112], rax
	mov	dword ptr [rbp - 116], 5
	mov	rax, qword ptr [rbp - 112]
	mov	edx, dword ptr [rbp - 116]
	mov	qword ptr [rbp - 96], rax
	mov	dword ptr [rbp - 100], edx
	mov	rax, qword ptr [rbp - 96]
	mov	edx, dword ptr [rax + 32]
	mov	esi, dword ptr [rbp - 100]
	or	edx, esi
Ltmp24:
	mov	rdi, rax
	mov	esi, edx
	call	__ZNSt3__18ios_base5clearEj
Ltmp25:
	jmp	LBB6_20
LBB6_20:
	jmp	LBB6_21
LBB6_21:
	jmp	LBB6_25
LBB6_22:
Ltmp31:
	mov	ecx, edx
	mov	qword ptr [rbp - 240], rax
	mov	dword ptr [rbp - 244], ecx
	jmp	LBB6_29
LBB6_23:
Ltmp26:
	mov	ecx, edx
	mov	qword ptr [rbp - 368], rax ## 8-byte Spill
	mov	dword ptr [rbp - 372], ecx ## 4-byte Spill
	jmp	LBB6_24
LBB6_24:
	mov	eax, dword ptr [rbp - 372] ## 4-byte Reload
	mov	rcx, qword ptr [rbp - 368] ## 8-byte Reload
	mov	qword ptr [rbp - 240], rcx
	mov	dword ptr [rbp - 244], eax
Ltmp27:
	lea	rdi, [rbp - 232]
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev
Ltmp28:
	jmp	LBB6_28
LBB6_25:
	jmp	LBB6_26
LBB6_26:
Ltmp29:
	lea	rdi, [rbp - 232]
	call	__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev
Ltmp30:
	jmp	LBB6_27
LBB6_27:
	jmp	LBB6_31
LBB6_28:
	jmp	LBB6_29
LBB6_29:
	mov	rdi, qword ptr [rbp - 240]
	call	___cxa_begin_catch
	mov	rdi, qword ptr [rbp - 200]
	mov	rcx, qword ptr [rdi]
	mov	rcx, qword ptr [rcx - 24]
	add	rdi, rcx
Ltmp32:
	mov	qword ptr [rbp - 408], rax ## 8-byte Spill
	call	__ZNSt3__18ios_base33__set_badbit_and_consider_rethrowEv
Ltmp33:
	jmp	LBB6_30
LBB6_30:
	call	___cxa_end_catch
LBB6_31:
	mov	rax, qword ptr [rbp - 200]
	add	rsp, 416
	pop	rbp
	ret
LBB6_32:
Ltmp34:
	mov	ecx, edx
	mov	qword ptr [rbp - 240], rax
	mov	dword ptr [rbp - 244], ecx
Ltmp35:
	call	___cxa_end_catch
Ltmp36:
	jmp	LBB6_33
LBB6_33:
	jmp	LBB6_34
LBB6_34:
	mov	rdi, qword ptr [rbp - 240]
	call	__Unwind_Resume
	ud2
LBB6_35:
Ltmp37:
	mov	rdi, rax
	mov	qword ptr [rbp - 416], rdx ## 8-byte Spill
	call	___clang_call_terminate
Lfunc_end1:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table6:
Lexception1:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\253\201"              ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.ascii	"\234\001"              ## Call site table length
Lset10 = Ltmp8-Lfunc_begin1             ## >> Call Site 1 <<
	.long	Lset10
Lset11 = Ltmp9-Ltmp8                    ##   Call between Ltmp8 and Ltmp9
	.long	Lset11
Lset12 = Ltmp31-Lfunc_begin1            ##     jumps to Ltmp31
	.long	Lset12
	.byte	5                       ##   On action: 3
Lset13 = Ltmp10-Lfunc_begin1            ## >> Call Site 2 <<
	.long	Lset13
Lset14 = Ltmp11-Ltmp10                  ##   Call between Ltmp10 and Ltmp11
	.long	Lset14
Lset15 = Ltmp26-Lfunc_begin1            ##     jumps to Ltmp26
	.long	Lset15
	.byte	5                       ##   On action: 3
Lset16 = Ltmp12-Lfunc_begin1            ## >> Call Site 3 <<
	.long	Lset16
Lset17 = Ltmp15-Ltmp12                  ##   Call between Ltmp12 and Ltmp15
	.long	Lset17
Lset18 = Ltmp16-Lfunc_begin1            ##     jumps to Ltmp16
	.long	Lset18
	.byte	3                       ##   On action: 2
Lset19 = Ltmp17-Lfunc_begin1            ## >> Call Site 4 <<
	.long	Lset19
Lset20 = Ltmp18-Ltmp17                  ##   Call between Ltmp17 and Ltmp18
	.long	Lset20
Lset21 = Ltmp19-Lfunc_begin1            ##     jumps to Ltmp19
	.long	Lset21
	.byte	7                       ##   On action: 4
Lset22 = Ltmp20-Lfunc_begin1            ## >> Call Site 5 <<
	.long	Lset22
Lset23 = Ltmp25-Ltmp20                  ##   Call between Ltmp20 and Ltmp25
	.long	Lset23
Lset24 = Ltmp26-Lfunc_begin1            ##     jumps to Ltmp26
	.long	Lset24
	.byte	5                       ##   On action: 3
Lset25 = Ltmp27-Lfunc_begin1            ## >> Call Site 6 <<
	.long	Lset25
Lset26 = Ltmp28-Ltmp27                  ##   Call between Ltmp27 and Ltmp28
	.long	Lset26
Lset27 = Ltmp37-Lfunc_begin1            ##     jumps to Ltmp37
	.long	Lset27
	.byte	5                       ##   On action: 3
Lset28 = Ltmp29-Lfunc_begin1            ## >> Call Site 7 <<
	.long	Lset28
Lset29 = Ltmp30-Ltmp29                  ##   Call between Ltmp29 and Ltmp30
	.long	Lset29
Lset30 = Ltmp31-Lfunc_begin1            ##     jumps to Ltmp31
	.long	Lset30
	.byte	5                       ##   On action: 3
Lset31 = Ltmp30-Lfunc_begin1            ## >> Call Site 8 <<
	.long	Lset31
Lset32 = Ltmp32-Ltmp30                  ##   Call between Ltmp30 and Ltmp32
	.long	Lset32
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset33 = Ltmp32-Lfunc_begin1            ## >> Call Site 9 <<
	.long	Lset33
Lset34 = Ltmp33-Ltmp32                  ##   Call between Ltmp32 and Ltmp33
	.long	Lset34
Lset35 = Ltmp34-Lfunc_begin1            ##     jumps to Ltmp34
	.long	Lset35
	.byte	0                       ##   On action: cleanup
Lset36 = Ltmp33-Lfunc_begin1            ## >> Call Site 10 <<
	.long	Lset36
Lset37 = Ltmp35-Ltmp33                  ##   Call between Ltmp33 and Ltmp35
	.long	Lset37
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset38 = Ltmp35-Lfunc_begin1            ## >> Call Site 11 <<
	.long	Lset38
Lset39 = Ltmp36-Ltmp35                  ##   Call between Ltmp35 and Ltmp36
	.long	Lset39
Lset40 = Ltmp37-Lfunc_begin1            ##     jumps to Ltmp37
	.long	Lset40
	.byte	5                       ##   On action: 3
Lset41 = Ltmp36-Lfunc_begin1            ## >> Call Site 12 <<
	.long	Lset41
Lset42 = Lfunc_end1-Ltmp36              ##   Call between Ltmp36 and Lfunc_end1
	.long	Lset42
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	0                       ## >> Action Record 1 <<
                                        ##   Cleanup
	.byte	0                       ##   No further actions
	.byte	1                       ## >> Action Record 2 <<
                                        ##   Catch TypeInfo 1
	.byte	125                     ##   Continue to action 1
	.byte	1                       ## >> Action Record 3 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
	.byte	1                       ## >> Action Record 4 <<
                                        ##   Catch TypeInfo 1
	.byte	125                     ##   Continue to action 3
                                        ## >> Catch TypeInfos <<
	.long	0                       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.private_extern	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_ ## -- Begin function _ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
	.globl	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
	.weak_definition	__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
	.p2align	4, 0x90
__ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_: ## @_ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_
Lfunc_begin2:
	.cfi_startproc
	.cfi_personality 155, ___gxx_personality_v0
	.cfi_lsda 16, Lexception2
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 736
	mov	al, r9b
	lea	r10, [rbp - 560]
	lea	r11, [rbp - 496]
	mov	qword ptr [rbp - 512], rdi
	mov	qword ptr [rbp - 520], rsi
	mov	qword ptr [rbp - 528], rdx
	mov	qword ptr [rbp - 536], rcx
	mov	qword ptr [rbp - 544], r8
	mov	byte ptr [rbp - 545], al
	mov	rcx, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 480], r11
	mov	qword ptr [rbp - 488], -1
	mov	rdx, qword ptr [rbp - 480]
	mov	rsi, qword ptr [rbp - 488]
	mov	qword ptr [rbp - 464], rdx
	mov	qword ptr [rbp - 472], rsi
	mov	rdx, qword ptr [rbp - 464]
	mov	qword ptr [rdx], 0
	mov	rdx, qword ptr [rbp - 496]
	mov	qword ptr [rbp - 560], rdx
	mov	qword ptr [rbp - 456], r10
	cmp	rcx, 0
	jne	LBB7_2
## %bb.1:
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	jmp	LBB7_29
LBB7_2:
	mov	rax, qword ptr [rbp - 536]
	mov	rcx, qword ptr [rbp - 520]
	sub	rax, rcx
	mov	qword ptr [rbp - 568], rax
	mov	rax, qword ptr [rbp - 544]
	mov	qword ptr [rbp - 352], rax
	mov	rax, qword ptr [rbp - 352]
	mov	rax, qword ptr [rax + 24]
	mov	qword ptr [rbp - 576], rax
	mov	rax, qword ptr [rbp - 576]
	cmp	rax, qword ptr [rbp - 568]
	jle	LBB7_4
## %bb.3:
	mov	rax, qword ptr [rbp - 568]
	mov	rcx, qword ptr [rbp - 576]
	sub	rcx, rax
	mov	qword ptr [rbp - 576], rcx
	jmp	LBB7_5
LBB7_4:
	mov	qword ptr [rbp - 576], 0
LBB7_5:
	mov	rax, qword ptr [rbp - 528]
	mov	rcx, qword ptr [rbp - 520]
	sub	rax, rcx
	mov	qword ptr [rbp - 584], rax
	cmp	qword ptr [rbp - 584], 0
	jle	LBB7_9
## %bb.6:
	mov	rax, qword ptr [rbp - 512]
	mov	rcx, qword ptr [rbp - 520]
	mov	rdx, qword ptr [rbp - 584]
	mov	qword ptr [rbp - 256], rax
	mov	qword ptr [rbp - 264], rcx
	mov	qword ptr [rbp - 272], rdx
	mov	rax, qword ptr [rbp - 256]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx + 96]
	mov	rsi, qword ptr [rbp - 264]
	mov	rdx, qword ptr [rbp - 272]
	mov	rdi, rax
	call	rcx
	cmp	rax, qword ptr [rbp - 584]
	je	LBB7_8
## %bb.7:
	lea	rax, [rbp - 592]
	lea	rcx, [rbp - 248]
	mov	qword ptr [rbp - 232], rcx
	mov	qword ptr [rbp - 240], -1
	mov	rcx, qword ptr [rbp - 232]
	mov	rdx, qword ptr [rbp - 240]
	mov	qword ptr [rbp - 216], rcx
	mov	qword ptr [rbp - 224], rdx
	mov	rcx, qword ptr [rbp - 216]
	mov	qword ptr [rcx], 0
	mov	rcx, qword ptr [rbp - 248]
	mov	qword ptr [rbp - 592], rcx
	mov	qword ptr [rbp - 8], rax
	mov	qword ptr [rbp - 512], 0
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	jmp	LBB7_29
LBB7_8:
	jmp	LBB7_9
LBB7_9:
	cmp	qword ptr [rbp - 576], 0
	jle	LBB7_24
## %bb.10:
	xor	esi, esi
	mov	eax, 24
	mov	edx, eax
	lea	rcx, [rbp - 616]
	mov	rdi, qword ptr [rbp - 576]
	mov	r8b, byte ptr [rbp - 545]
	mov	qword ptr [rbp - 80], rcx
	mov	qword ptr [rbp - 88], rdi
	mov	byte ptr [rbp - 89], r8b
	mov	rcx, qword ptr [rbp - 80]
	mov	rdi, qword ptr [rbp - 88]
	mov	r8b, byte ptr [rbp - 89]
	mov	qword ptr [rbp - 56], rcx
	mov	qword ptr [rbp - 64], rdi
	mov	byte ptr [rbp - 65], r8b
	mov	rcx, qword ptr [rbp - 56]
	mov	qword ptr [rbp - 48], rcx
	mov	rdi, qword ptr [rbp - 48]
	mov	qword ptr [rbp - 40], rdi
	mov	rdi, qword ptr [rbp - 40]
	mov	r9, rdi
	mov	qword ptr [rbp - 32], r9
	mov	r9, qword ptr [rbp - 32]
	mov	qword ptr [rbp - 664], rdi ## 8-byte Spill
	mov	rdi, r9
	mov	qword ptr [rbp - 672], rcx ## 8-byte Spill
	call	_memset
	mov	rcx, qword ptr [rbp - 664] ## 8-byte Reload
	mov	qword ptr [rbp - 24], rcx
	mov	rcx, qword ptr [rbp - 24]
	mov	qword ptr [rbp - 16], rcx
	mov	rsi, qword ptr [rbp - 64]
	mov	rdi, qword ptr [rbp - 672] ## 8-byte Reload
	movsx	edx, byte ptr [rbp - 65]
	call	__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEmc
	lea	rcx, [rbp - 616]
	mov	rsi, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 208], rcx
	mov	rcx, qword ptr [rbp - 208]
	mov	qword ptr [rbp - 200], rcx
	mov	rcx, qword ptr [rbp - 200]
	mov	qword ptr [rbp - 192], rcx
	mov	rdi, qword ptr [rbp - 192]
	mov	qword ptr [rbp - 184], rdi
	mov	rdi, qword ptr [rbp - 184]
	mov	qword ptr [rbp - 176], rdi
	mov	rdi, qword ptr [rbp - 176]
	movzx	eax, byte ptr [rdi]
	mov	edi, eax
	and	rdi, 1
	cmp	rdi, 0
	mov	qword ptr [rbp - 680], rsi ## 8-byte Spill
	mov	qword ptr [rbp - 688], rcx ## 8-byte Spill
	je	LBB7_12
## %bb.11:
	mov	rax, qword ptr [rbp - 688] ## 8-byte Reload
	mov	qword ptr [rbp - 128], rax
	mov	rcx, qword ptr [rbp - 128]
	mov	qword ptr [rbp - 120], rcx
	mov	rcx, qword ptr [rbp - 120]
	mov	qword ptr [rbp - 112], rcx
	mov	rcx, qword ptr [rbp - 112]
	mov	rcx, qword ptr [rcx + 16]
	mov	qword ptr [rbp - 696], rcx ## 8-byte Spill
	jmp	LBB7_13
LBB7_12:
	mov	rax, qword ptr [rbp - 688] ## 8-byte Reload
	mov	qword ptr [rbp - 168], rax
	mov	rcx, qword ptr [rbp - 168]
	mov	qword ptr [rbp - 160], rcx
	mov	rcx, qword ptr [rbp - 160]
	mov	qword ptr [rbp - 152], rcx
	mov	rcx, qword ptr [rbp - 152]
	add	rcx, 1
	mov	qword ptr [rbp - 144], rcx
	mov	rcx, qword ptr [rbp - 144]
	mov	qword ptr [rbp - 136], rcx
	mov	rcx, qword ptr [rbp - 136]
	mov	qword ptr [rbp - 696], rcx ## 8-byte Spill
LBB7_13:
	mov	rax, qword ptr [rbp - 696] ## 8-byte Reload
	mov	qword ptr [rbp - 104], rax
	mov	rax, qword ptr [rbp - 104]
	mov	rcx, qword ptr [rbp - 576]
	mov	rdx, qword ptr [rbp - 680] ## 8-byte Reload
	mov	qword ptr [rbp - 280], rdx
	mov	qword ptr [rbp - 288], rax
	mov	qword ptr [rbp - 296], rcx
	mov	rax, qword ptr [rbp - 280]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx + 96]
	mov	rsi, qword ptr [rbp - 288]
	mov	rdx, qword ptr [rbp - 296]
Ltmp38:
	mov	rdi, rax
	call	rcx
Ltmp39:
	mov	qword ptr [rbp - 704], rax ## 8-byte Spill
	jmp	LBB7_14
LBB7_14:
	jmp	LBB7_15
LBB7_15:
	mov	rax, qword ptr [rbp - 704] ## 8-byte Reload
	cmp	rax, qword ptr [rbp - 576]
	je	LBB7_20
## %bb.16:
	lea	rax, [rbp - 336]
	mov	qword ptr [rbp - 320], rax
	mov	qword ptr [rbp - 328], -1
	mov	rax, qword ptr [rbp - 320]
	mov	rcx, qword ptr [rbp - 328]
	mov	qword ptr [rbp - 304], rax
	mov	qword ptr [rbp - 312], rcx
	mov	rax, qword ptr [rbp - 304]
	mov	qword ptr [rax], 0
	mov	rax, qword ptr [rbp - 336]
	mov	qword ptr [rbp - 712], rax ## 8-byte Spill
## %bb.17:
	lea	rax, [rbp - 640]
	mov	rcx, qword ptr [rbp - 712] ## 8-byte Reload
	mov	qword ptr [rbp - 640], rcx
	mov	qword ptr [rbp - 344], rax
## %bb.18:
	mov	qword ptr [rbp - 512], 0
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	mov	dword ptr [rbp - 644], 1
	jmp	LBB7_21
LBB7_19:
Ltmp40:
	mov	ecx, edx
	mov	qword ptr [rbp - 624], rax
	mov	dword ptr [rbp - 628], ecx
Ltmp41:
	lea	rdi, [rbp - 616]
	call	__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev
Ltmp42:
	jmp	LBB7_23
LBB7_20:
	mov	dword ptr [rbp - 644], 0
LBB7_21:
	lea	rdi, [rbp - 616]
	call	__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev
	mov	eax, dword ptr [rbp - 644]
	test	eax, eax
	mov	dword ptr [rbp - 716], eax ## 4-byte Spill
	je	LBB7_22
	jmp	LBB7_33
LBB7_33:
	mov	eax, dword ptr [rbp - 716] ## 4-byte Reload
	sub	eax, 1
	mov	dword ptr [rbp - 720], eax ## 4-byte Spill
	je	LBB7_29
	jmp	LBB7_32
LBB7_22:
	jmp	LBB7_24
LBB7_23:
	jmp	LBB7_30
LBB7_24:
	mov	rax, qword ptr [rbp - 536]
	mov	rcx, qword ptr [rbp - 528]
	sub	rax, rcx
	mov	qword ptr [rbp - 584], rax
	cmp	qword ptr [rbp - 584], 0
	jle	LBB7_28
## %bb.25:
	mov	rax, qword ptr [rbp - 512]
	mov	rcx, qword ptr [rbp - 528]
	mov	rdx, qword ptr [rbp - 584]
	mov	qword ptr [rbp - 360], rax
	mov	qword ptr [rbp - 368], rcx
	mov	qword ptr [rbp - 376], rdx
	mov	rax, qword ptr [rbp - 360]
	mov	rcx, qword ptr [rax]
	mov	rcx, qword ptr [rcx + 96]
	mov	rsi, qword ptr [rbp - 368]
	mov	rdx, qword ptr [rbp - 376]
	mov	rdi, rax
	call	rcx
	cmp	rax, qword ptr [rbp - 584]
	je	LBB7_27
## %bb.26:
	lea	rax, [rbp - 656]
	lea	rcx, [rbp - 416]
	mov	qword ptr [rbp - 400], rcx
	mov	qword ptr [rbp - 408], -1
	mov	rcx, qword ptr [rbp - 400]
	mov	rdx, qword ptr [rbp - 408]
	mov	qword ptr [rbp - 384], rcx
	mov	qword ptr [rbp - 392], rdx
	mov	rcx, qword ptr [rbp - 384]
	mov	qword ptr [rcx], 0
	mov	rcx, qword ptr [rbp - 416]
	mov	qword ptr [rbp - 656], rcx
	mov	qword ptr [rbp - 424], rax
	mov	qword ptr [rbp - 512], 0
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
	jmp	LBB7_29
LBB7_27:
	jmp	LBB7_28
LBB7_28:
	mov	rax, qword ptr [rbp - 544]
	mov	qword ptr [rbp - 432], rax
	mov	qword ptr [rbp - 440], 0
	mov	rax, qword ptr [rbp - 432]
	mov	rcx, qword ptr [rax + 24]
	mov	qword ptr [rbp - 448], rcx
	mov	rcx, qword ptr [rbp - 440]
	mov	qword ptr [rax + 24], rcx
	mov	rax, qword ptr [rbp - 512]
	mov	qword ptr [rbp - 504], rax
LBB7_29:
	mov	rax, qword ptr [rbp - 504]
	add	rsp, 736
	pop	rbp
	ret
LBB7_30:
	mov	rdi, qword ptr [rbp - 624]
	call	__Unwind_Resume
	ud2
LBB7_31:
Ltmp43:
	mov	rdi, rax
	mov	qword ptr [rbp - 728], rdx ## 8-byte Spill
	call	___clang_call_terminate
LBB7_32:
	ud2
Lfunc_end2:
	.cfi_endproc
	.section	__TEXT,__gcc_except_tab
	.p2align	2
GCC_except_table7:
Lexception2:
	.byte	255                     ## @LPStart Encoding = omit
	.byte	155                     ## @TType Encoding = indirect pcrel sdata4
	.asciz	"\274"                  ## @TType base offset
	.byte	3                       ## Call site Encoding = udata4
	.byte	52                      ## Call site table length
Lset43 = Lfunc_begin2-Lfunc_begin2      ## >> Call Site 1 <<
	.long	Lset43
Lset44 = Ltmp38-Lfunc_begin2            ##   Call between Lfunc_begin2 and Ltmp38
	.long	Lset44
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
Lset45 = Ltmp38-Lfunc_begin2            ## >> Call Site 2 <<
	.long	Lset45
Lset46 = Ltmp39-Ltmp38                  ##   Call between Ltmp38 and Ltmp39
	.long	Lset46
Lset47 = Ltmp40-Lfunc_begin2            ##     jumps to Ltmp40
	.long	Lset47
	.byte	0                       ##   On action: cleanup
Lset48 = Ltmp41-Lfunc_begin2            ## >> Call Site 3 <<
	.long	Lset48
Lset49 = Ltmp42-Ltmp41                  ##   Call between Ltmp41 and Ltmp42
	.long	Lset49
Lset50 = Ltmp43-Lfunc_begin2            ##     jumps to Ltmp43
	.long	Lset50
	.byte	1                       ##   On action: 1
Lset51 = Ltmp42-Lfunc_begin2            ## >> Call Site 4 <<
	.long	Lset51
Lset52 = Lfunc_end2-Ltmp42              ##   Call between Ltmp42 and Lfunc_end2
	.long	Lset52
	.long	0                       ##     has no landing pad
	.byte	0                       ##   On action: cleanup
	.byte	1                       ## >> Action Record 1 <<
                                        ##   Catch TypeInfo 1
	.byte	0                       ##   No further actions
                                        ## >> Catch TypeInfos <<
	.long	0                       ## TypeInfo 1
	.p2align	2
                                        ## -- End function
	.section	__TEXT,__text,regular,pure_instructions
	.globl	__ZNSt3__111char_traitsIcE11eq_int_typeEii ## -- Begin function _ZNSt3__111char_traitsIcE11eq_int_typeEii
	.weak_definition	__ZNSt3__111char_traitsIcE11eq_int_typeEii
	.p2align	4, 0x90
__ZNSt3__111char_traitsIcE11eq_int_typeEii: ## @_ZNSt3__111char_traitsIcE11eq_int_typeEii
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	dword ptr [rbp - 4], edi
	mov	dword ptr [rbp - 8], esi
	mov	esi, dword ptr [rbp - 4]
	cmp	esi, dword ptr [rbp - 8]
	sete	al
	and	al, 1
	movzx	eax, al
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZNSt3__111char_traitsIcE3eofEv ## -- Begin function _ZNSt3__111char_traitsIcE3eofEv
	.weak_definition	__ZNSt3__111char_traitsIcE3eofEv
	.p2align	4, 0x90
__ZNSt3__111char_traitsIcE3eofEv:       ## @_ZNSt3__111char_traitsIcE3eofEv
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	mov	eax, 4294967295
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.globl	__ZNSt3__111char_traitsIcE6lengthEPKc ## -- Begin function _ZNSt3__111char_traitsIcE6lengthEPKc
	.weak_definition	__ZNSt3__111char_traitsIcE6lengthEPKc
	.p2align	4, 0x90
__ZNSt3__111char_traitsIcE6lengthEPKc:  ## @_ZNSt3__111char_traitsIcE6lengthEPKc
	.cfi_startproc
## %bb.0:
	push	rbp
	.cfi_def_cfa_offset 16
	.cfi_offset rbp, -16
	mov	rbp, rsp
	.cfi_def_cfa_register rbp
	sub	rsp, 16
	mov	qword ptr [rbp - 8], rdi
	mov	rdi, qword ptr [rbp - 8]
	call	_strlen
	add	rsp, 16
	pop	rbp
	ret
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"halt"


.subsections_via_symbols
