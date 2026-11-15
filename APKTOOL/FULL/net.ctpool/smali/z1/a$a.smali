.class public final Lz1/a$a;
.super Lcom/facebook/imagepipeline/producers/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/a;->A()Lcom/facebook/imagepipeline/producers/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lz1/a;


# direct methods
.method constructor <init>(Lz1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz1/a$a;->b:Lz1/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/a$a;->b:Lz1/a;

    .line 2
    .line 3
    invoke-static {v0}, Lz1/a;->x(Lz1/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected h(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "throwable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz1/a$a;->b:Lz1/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz1/a;->y(Lz1/a;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected i(Ljava/lang/Object;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz1/a$a;->b:Lz1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz1/a;->C()Lcom/facebook/imagepipeline/producers/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, p2, v1}, Lz1/a;->F(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected j(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/a$a;->b:Lz1/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz1/a;->z(Lz1/a;F)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
