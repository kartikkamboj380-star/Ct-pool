.class Lh4/I$a$a;
.super Lh4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/I$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/Runnable;

.field final synthetic n:Lh4/I$a;


# direct methods
.method constructor <init>(Lh4/I$a;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh4/I$a$a;->n:Lh4/I$a;

    .line 2
    .line 3
    iput-object p2, p0, Lh4/I$a$a;->m:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-direct {p0}, Lh4/e;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/I$a$a;->m:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
