.class public final Lcom/facebook/soloader/j;
.super Lcom/facebook/soloader/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/soloader/j$b;,
        Lcom/facebook/soloader/j$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/soloader/C;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ExoSoSource"

    return-object v0
.end method

.method protected o(Z)Lcom/facebook/soloader/C$e;
    .locals 0

    .line 1
    new-instance p1, Lcom/facebook/soloader/j$a;

    invoke-direct {p1, p0, p0}, Lcom/facebook/soloader/j$a;-><init>(Lcom/facebook/soloader/j;Lcom/facebook/soloader/C;)V

    return-object p1
.end method
