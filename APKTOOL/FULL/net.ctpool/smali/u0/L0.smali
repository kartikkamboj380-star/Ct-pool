.class public final synthetic Lu0/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/L0;->a:Ljava/util/List;

    iput p2, p0, Lu0/L0;->b:I

    iput-object p3, p0, Lu0/L0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/L0;->a:Ljava/util/List;

    iget v1, p0, Lu0/L0;->b:I

    iget-object v2, p0, Lu0/L0;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lu0/R0;->d(Ljava/util/List;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
