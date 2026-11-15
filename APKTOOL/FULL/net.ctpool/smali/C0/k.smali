.class public final LC0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC0/k$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(LC0/k$a;LC0/L;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LC0/k$a;->c(LC0/k$a;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LC0/k;->a:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static a()LC0/k$a;
    .locals 2

    .line 1
    new-instance v0, LC0/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LC0/k$a;-><init>(LC0/K;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/k;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
