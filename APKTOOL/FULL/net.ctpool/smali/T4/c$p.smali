.class LT4/c$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT4/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT4/c;->c(Ljava/lang/Class;LR4/n;)LT4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT4/c$p;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LR4/g;

    .line 2
    .line 3
    iget-object v1, p0, LT4/c$p;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LR4/g;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
