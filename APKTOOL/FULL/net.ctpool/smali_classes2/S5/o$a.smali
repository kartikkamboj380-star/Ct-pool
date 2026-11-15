.class public LS5/o$a;
.super Lz1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/o;->c(Ljava/lang/String;)Lz3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz3/m;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lz3/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS5/o$a;->a:Lz3/m;

    .line 2
    .line 3
    iput-object p2, p0, LS5/o$a;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Lz1/b;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public e(LY0/c;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Failed to load an image: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LS5/o$a;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1}, LY0/c;->c()Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "ResourceUtils"

    .line 25
    .line 26
    invoke-static {v1, v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LS5/o$a;->a:Lz3/m;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, v0}, Lz3/m;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public g(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS5/o$a;->a:Lz3/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/m;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
