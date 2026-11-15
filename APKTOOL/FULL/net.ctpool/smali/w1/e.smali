.class public final synthetic Lw1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lw1/j;

.field public final synthetic d:LI0/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lw1/j;LI0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/e;->a:Ljava/lang/Object;

    iput-object p2, p0, Lw1/e;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lw1/e;->c:Lw1/j;

    iput-object p4, p0, Lw1/e;->d:LI0/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lw1/e;->a:Ljava/lang/Object;

    iget-object v1, p0, Lw1/e;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Lw1/e;->c:Lw1/j;

    iget-object v3, p0, Lw1/e;->d:LI0/d;

    invoke-static {v0, v1, v2, v3}, Lw1/j;->e(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lw1/j;LI0/d;)LD1/g;

    move-result-object v0

    return-object v0
.end method
