.class public final synthetic Lcom/th3rdwave/safeareacontext/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Ljava/util/concurrent/locks/ReentrantLock;

.field public final synthetic n:Lw5/s;

.field public final synthetic o:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/locks/ReentrantLock;Lw5/s;Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/j;->m:Ljava/util/concurrent/locks/ReentrantLock;

    iput-object p2, p0, Lcom/th3rdwave/safeareacontext/j;->n:Lw5/s;

    iput-object p3, p0, Lcom/th3rdwave/safeareacontext/j;->o:Ljava/util/concurrent/locks/Condition;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/j;->m:Ljava/util/concurrent/locks/ReentrantLock;

    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/j;->n:Lw5/s;

    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/j;->o:Ljava/util/concurrent/locks/Condition;

    invoke-static {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/k;->q(Ljava/util/concurrent/locks/ReentrantLock;Lw5/s;Ljava/util/concurrent/locks/Condition;)V

    return-void
.end method
