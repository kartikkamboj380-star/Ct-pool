.class public final LT5/c$a$a;
.super Li6/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/c$a;-><init>(LW5/d$d;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic n:LT5/c$a;

.field final synthetic o:Li6/C;


# direct methods
.method constructor <init>(LT5/c$a;Li6/C;Li6/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT5/c$a$a;->n:LT5/c$a;

    .line 2
    .line 3
    iput-object p2, p0, LT5/c$a$a;->o:Li6/C;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Li6/l;-><init>(Li6/C;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LT5/c$a$a;->n:LT5/c$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/c$a;->n()LW5/d$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LW5/d$d;->close()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Li6/l;->close()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
