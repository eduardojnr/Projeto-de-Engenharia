import { FormGroup } from "@angular/forms";

export function usuarioSenhaIguaisValidator (formGroup: FormGroup) {
  const username = formGroup.get('username')?.value ?? '';
  const senha = formGroup.get('senha')?.value ?? '';

  if (username.trim() + senha.trim()) {
    return username != senha ? null: { senhaIgualUsuario: true };
  }
  else {
    return null;
  }
}
