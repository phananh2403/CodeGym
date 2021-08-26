package exercise.memory_pool;

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}