package com.terabits.cadastro_usuario.business;


import com.terabits.cadastro_usuario.infraestructure.entity.Usuario;
import com.terabits.cadastro_usuario.infraestructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;

    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){
    return repository.findByEmail(email).orElseThrow(
            ()->  new RuntimeException("Email nao encontrado"));
    }


    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }


    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário com ID " + id + " não encontrado"));

        Usuario usuarioAtualizado = Usuario.builder()
                .id(usuarioEntity.getId())
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }


}
