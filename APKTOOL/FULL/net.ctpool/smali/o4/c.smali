.class public final synthetic Lo4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS2/k;


# instance fields
.field public final synthetic a:Lo4/e;

.field public final synthetic b:Lz3/m;

.field public final synthetic c:Z

.field public final synthetic d:Lh4/D;


# direct methods
.method public synthetic constructor <init>(Lo4/e;Lz3/m;ZLh4/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/c;->a:Lo4/e;

    iput-object p2, p0, Lo4/c;->b:Lz3/m;

    iput-boolean p3, p0, Lo4/c;->c:Z

    iput-object p4, p0, Lo4/c;->d:Lh4/D;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo4/c;->a:Lo4/e;

    iget-object v1, p0, Lo4/c;->b:Lz3/m;

    iget-boolean v2, p0, Lo4/c;->c:Z

    iget-object v3, p0, Lo4/c;->d:Lh4/D;

    invoke-static {v0, v1, v2, v3, p1}, Lo4/e;->a(Lo4/e;Lz3/m;ZLh4/D;Ljava/lang/Exception;)V

    return-void
.end method
