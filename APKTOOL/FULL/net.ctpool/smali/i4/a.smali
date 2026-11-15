.class public final synthetic Li4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Lz3/m;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lz3/b;


# direct methods
.method public synthetic constructor <init>(Lz3/m;Ljava/util/concurrent/atomic/AtomicBoolean;Lz3/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/a;->a:Lz3/m;

    iput-object p2, p0, Li4/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Li4/a;->c:Lz3/b;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li4/a;->a:Lz3/m;

    iget-object v1, p0, Li4/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Li4/a;->c:Lz3/b;

    invoke-static {v0, v1, v2, p1}, Li4/b;->a(Lz3/m;Ljava/util/concurrent/atomic/AtomicBoolean;Lz3/b;Lz3/l;)Lz3/l;

    move-result-object p1

    return-object p1
.end method
